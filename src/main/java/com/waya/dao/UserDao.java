package com.waya.dao;

import com.waya.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface UserDao {

    /**
     *
     *插入用户
     * @param id
     * @param phone
     * @param userName
     * @param userPassword
     * @return 插入的行数
     */
    int insertUser(@Param("id") String id, @Param("phone") String phone,@Param("userName") String userName,@Param("userPassword") String userPassword);


    /**
     *
     *根据手机查询是否有该用户
     * @param phone
     * @return 插入的行数
     */
    List<User> queryByPhone(@Param("phone") String phone);


    /**
     *
     *查询所有用户
     */
    List<User> queryAll();


    /**
     *
     *根据手机删除该用户
     * @param phone
     * @return 删除的行数
     */
    int delUserByPhone(@Param("phone") String phone);

    /**
     *
     *根据id删除该用户
     * @param id
     * @return 删除的行数
     */
    int delUserById(@Param("id") String id);



}
