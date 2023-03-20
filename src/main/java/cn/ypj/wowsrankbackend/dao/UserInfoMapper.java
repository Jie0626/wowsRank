package cn.ypj.wowsrankbackend.dao;

import java.util.List;
import cn.ypj.wowsrankbackend.model.UserInfo;
import cn.ypj.wowsrankbackend.model.UserInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    long countByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int deleteByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int insertSelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    UserInfo selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Fri Mar 17 15:50:42 CST 2023
     */
    int updateByPrimaryKey(UserInfo record);

    void batchInsert(List<UserInfo> userInfos);
}