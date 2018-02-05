package com.waya.service;

import com.waya.entity.UserRole;

import java.util.List;

/**
 * Created by user on 2018/1/30.
 */
public interface UserRoleService {


//+++++++++++++++++++++++++以下为业务逻辑方法++++++++++++++++++++++++++++++

//   UserRole addUserRoleRelation()













//+++++++++++++++++++++++++以下为封装dao层的基本方法++++++++++++++++++++++++++++++
    /**
     *插入用户角色表单条记录
     * @param id
     * @param userId
     * @param roleId
     * @return 插入的行数
     */
    int insertUserRole(String id,  String userId,  String roleId);


    /**
     *
     *根据userId查关系表
     * @param userId
     * @return
     */
    List<UserRole> queryByUserId(String userId);

    /**
     *
     *根据roleId 查关系表
     * @param roleId
     * @return
     */
    List<UserRole> queryByRoleId(String roleId);

    /**
     *
     *查询所有用户角色表
     */
    List<UserRole> queryAll();


    /**
     *
     *根据userId删除单条
     * @param userId
     * @return 删除的行数
     */
    int delUserRoleByUserId(String userId);
    /**
     *
     *根据roleId删除单条
     * @param roleId
     * @return 删除的行数
     */
    int delUserRoleByRoleId(String roleId);

    /**
     *
     *根据id删除单条
     * @param id
     * @return 删除的行数
     */
    int delUserRoleById( String id);


}
