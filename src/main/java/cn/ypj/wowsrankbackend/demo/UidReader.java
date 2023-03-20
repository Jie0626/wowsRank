package cn.ypj.wowsrankbackend.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import cn.ypj.wowsrankbackend.model.UserInfo;

public class UidReader {

    public static List<UserInfo> readUidsFromFile(String filePath) {
        List<UserInfo> userInfoList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                line = line.replaceAll("[\\[\\]\\s]", ""); // 移除空格和方括号
                String[] uidArray = line.split(",");
                for (String uidStr : uidArray) {
                    UserInfo userInfo = new UserInfo();
                    userInfo.setUid(Integer.parseInt(uidStr));
                    userInfoList.add(userInfo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfoList;
    }
}
