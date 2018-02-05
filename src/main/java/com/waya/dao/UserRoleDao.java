package com.waya.dao;

import com.waya.entity.User;
import com.waya.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface UserRoleDao {

    /**
     *插入用户角色表单条记录
     * @param id
     * @param userId
     * @param roleId
     * @return 插入的行数
     */
    int insertUserRole(@Param("id") String id, @Param("userId") String userId, @Param("roleId") String roleId);


    /**
     *
     *根据userId查关系表
     * @param userId
     * @return
     */
    List<UserRole> queryByUserId(@Param("userId") String userId);

    /**
     *
     *根据roleId 查关系表
     * @param roleId
     * @return
     */
    List<UserRole> queryByRoleId(@Param("roleId") String roleId);

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
    int delUserRoleByUserId(@Param("userId") String userId);
    /**
     *
     *根据roleId删除单条
     * @param roleId
     * @return 删除的行数
     */
    int delUserRoleByRoleId(@Param("roleId") String roleId);

    /**
     *
     *根据id删除单条
     * @param id
     * @return 删除的行数
     */
    int delUserRoleById(@Param("id") String id);

}
