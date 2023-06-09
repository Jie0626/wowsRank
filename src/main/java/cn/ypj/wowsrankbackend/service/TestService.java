package cn.ypj.wowsrankbackend.service;

import cn.ypj.wowsrankbackend.dao.TestDao;
import cn.ypj.wowsrankbackend.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
