package cn.ypj.wowsrankbackend.service;

import cn.ypj.wowsrankbackend.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;


}
