package com.waya.entity;

/**
 * Created by user on 2018/1/29.
 */
public class Group {
    private String id;
    private String groupName;//不可重复，唯一索引
    private String parentGroup; // 父组
    private String hasParent;  //是否有父 组，1，有，0，无，默认0

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getParentGroup() {
        return parentGroup;
    }

    public void setParentGroup(String parentGroup) {
        this.parentGroup = parentGroup;
    }

    public String getHasParent() {
        return hasParent;
    }

    public void setHasParent(String hasParent) {
        this.hasParent = hasParent;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", groupName='" + groupName + '\'' +
                ", parentGroup='" + parentGroup + '\'' +
                ", hasParent='" + hasParent + '\'' +
                '}';
    }
}
