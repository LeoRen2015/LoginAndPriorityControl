package com.waya.service;

import com.waya.dto.LoginExcution;
import com.waya.entity.User;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface UserService {

    /*
    *
    *检查手机是否可用，手机格式前台校验
    * */
     Boolean hasNoPhone(String phone);

    /*
      *
      *用户手机注册，有手机则失败，已经注册，无手机则成功，注册，新增用户数据
      * */
     Boolean registerUser(String phone,String userName,String userPassword);

    /*
    *
    * 用户登录
    * */

      LoginExcution loginUser(String phone, String userPassword);


//    以下为封装userDao层基本操作

    /**
     *
     *插入用户
     *
     * @return 插入的行数
     */
    int insertUser(User user);


    /**
     *
     *根据手机查询是否有该用户
     * @param phone
     * @return 插入的行数
     */
    List<User> queryByPhone( String phone);


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
    int delUserByPhone(String phone);

    /**
     *
     *根据id删除该用户
     * @param id
     * @return 删除的行数
     */
    int delUserById(String id);

}
