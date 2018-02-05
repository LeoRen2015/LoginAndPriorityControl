package com.waya.dao;

import com.waya.entity.Group;
import com.waya.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface GroupDao {

    /**

     *插入用户组
     * @param id
     * @param groupName
     * @param parentGroup
     * @param hasParent
     * @return 插入的行数
     */
    int insertGroup(@Param("id") String id, @Param("groupName") String groupName, @Param("parentGroup") String parentGroup, @Param("hasParent") String hasParent);


    /**
     *
     *根据组名是否有该用户
     * @param groupName
     * @return 组列表
     */
    List<User> queryByGroupName(@Param("groupName") String groupName);


    /**
     *
     *查询所有组
     */
    List<Group> queryAll();


    /**
     *
     *根据组名删除该用户组
     * @param groupName
     * @return 删除的行数
     */
    int delUserByGroup(@Param("groupName") String groupName);

    /**
     *
     *根据id删除该用户组
     * @param id
     * @return 删除的行数
     */
    int delGroupById(@Param("id") String id);





}
