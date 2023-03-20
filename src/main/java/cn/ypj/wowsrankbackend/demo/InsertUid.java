package cn.ypj.wowsrankbackend.demo;

import cn.ypj.wowsrankbackend.service.UserInfoService;
import com.sun.glass.ui.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

import cn.ypj.wowsrankbackend.model.UserInfo;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "cn.ypj.wowsrankbackend") // 这将确保扫描您的包以找到UserInfoService等组件
public class InsertUid implements CommandLineRunner {
    @Autowired
    protected  UserInfoService userInfoService;

    public static void main(String[] args) {
        SpringApplication.run(InsertUid.class, args);
    }

    @Override
    public void run(String... args) {
        String filePath = "D:\\id_asia.json";
        List<UserInfo> userInfoList = UidReader.readUidsFromFile(filePath);

        int batchSize = 1000; // 每次插入1000条记录
        int threadCount = 4; // 使用4个线程
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        AtomicInteger recordsInserted = new AtomicInteger();
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            int startIndex = i * (userInfoList.size() / threadCount);
            int endIndex = Math.min((i + 1) * (userInfoList.size() / threadCount), userInfoList.size());

            List<UserInfo> userInfoSubList = userInfoList.subList(startIndex, endIndex);
            Future<?> future = executorService.submit(() -> {
                userInfoService.batchInsert(userInfoSubList, batchSize, recordsInserted::addAndGet);
                System.out.println("Inserted records: " + recordsInserted.get());
            });
            futures.add(future);
        }
        executorService.shutdown();
        futures.forEach(future -> {
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
    }

}

