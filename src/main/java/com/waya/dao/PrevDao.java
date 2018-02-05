package com.waya.dao;

import com.waya.entity.Prev;
import com.waya.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface PrevDao {

    /**
     *
     *插入权限
     * @param id
     * @param prev
     * @param resourceType
     * @return 插入的行数
     */
    int insertPrev(@Param("id") String id, @Param("prev") String prev, @Param("resourceType") String resourceType);


    /**
     *
     *根据权限查询是否有该权限
     * @param prev
     * @return 权限列表
     */
    List<Prev> queryByPrev(@Param("prev") String prev);


    /**
     *
     *查询所有权限
     */
    List<Prev> queryAll();


    /**
     *
     *根据权限名删除该权限
     * @param prev
     * @return 删除的行数
     */
    int delPrevByPrev(@Param("prev") String prev);

    /**
     *
     *根据id删除该权限
     * @param id
     * @return 删除的行数
     */
    int delPrevById(@Param("id") String id);





}
