package com.waya.dto;

/**
 * Created by user on 2018/1/28.
 * 封装json对象，所有的结果都使用它
 */
public class Result<T> {
    private boolean success; //是否成功标志
    private T data;  //成功时返回的数据
    private String error;

    public Result(){

    }

    // 成功时的构造器
    public  Result(Boolean success,T data){
        this.success = success;
        this.data = data;
    }


    // 错误时的构造器
    public Result(Boolean success, String error){
        this.error = error;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    
}
