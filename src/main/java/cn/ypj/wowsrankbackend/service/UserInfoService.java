package cn.ypj.wowsrankbackend.service;

import cn.ypj.wowsrankbackend.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ypj.wowsrankbackend.model.UserInfo;

import java.util.List;
import java.util.function.IntConsumer;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public void batchInsert(List<UserInfo> userInfoList, int batchSize, IntConsumer recordsInsertedCallback) {
        for (int i = 0; i < userInfoList.size(); i += batchSize) {
            int endIndex = Math.min(i + batchSize, userInfoList.size());
            List<UserInfo> userInfoBatch = userInfoList.subList(i, endIndex);
            userInfoMapper.batchInsert(userInfoBatch);
            recordsInsertedCallback.accept(userInfoBatch.size());
        }
    }

}
