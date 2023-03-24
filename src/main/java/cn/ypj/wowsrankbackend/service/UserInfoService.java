package cn.ypj.wowsrankbackend.service;

import cn.ypj.wowsrankbackend.Constants.UrlConstants;
import cn.ypj.wowsrankbackend.dao.UserInfoMapper;
import cn.ypj.wowsrankbackend.entity.ApiResponse;
import cn.ypj.wowsrankbackend.entity.PlayerData;
import cn.ypj.wowsrankbackend.utils.HttpClient;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ypj.wowsrankbackend.model.UserInfo;

import java.util.List;
import java.util.function.IntConsumer;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    //可以将这个实例传递给其他类和方法以便在应用程序中重用
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public void batchInsert(List<UserInfo> userInfoList, int batchSize, IntConsumer recordsInsertedCallback) {
        for (int i = 0; i < userInfoList.size(); i += batchSize) {
            int endIndex = Math.min(i + batchSize, userInfoList.size());
            List<UserInfo> userInfoBatch = userInfoList.subList(i, endIndex);
            userInfoMapper.batchInsert(userInfoBatch);
            recordsInsertedCallback.accept(userInfoBatch.size());
        }
    }

    public long getUidByUserName(String userName){
        StringBuilder getUidRequstUrl = new StringBuilder();
        getUidRequstUrl.append(UrlConstants.ASIA_UID).append(userName);
        String response = HttpClient.callThirdPartyAPI(getUidRequstUrl.toString());
        List<PlayerData> playerDataList = null;
        try {
            ApiResponse apiResponse = objectMapper.readValue(response, ApiResponse.class);
             playerDataList = apiResponse.getData();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return playerDataList.get(0).getSpa_id();
    }

}
