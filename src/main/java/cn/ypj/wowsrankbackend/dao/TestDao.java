package cn.ypj.wowsrankbackend.dao;

import cn.ypj.wowsrankbackend.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestDao {

    TestEntity getById(Integer id);

}