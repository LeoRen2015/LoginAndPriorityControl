package com.waya.entity;

/**
 * Created by user on 2018/1/29.
 */
public class Prev
{
    private  String id;
    private  String prev;
    private  String resourceType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "Prev{" +
                "id='" + id + '\'' +
                ", prev='" + prev + '\'' +
                ", type='" + resourceType + '\'' +
                '}';
    }
}
