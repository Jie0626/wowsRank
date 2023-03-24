package cn.ypj.wowsrankbackend.controller;

import cn.ypj.wowsrankbackend.entity.TestEntity;
import cn.ypj.wowsrankbackend.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wowsrankbackend/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getUidByUserName/{username}",method = RequestMethod.GET)
    public long getUidByUserName(@PathVariable String username){
        return userInfoService.getUidByUserName(username);
    }
}
