package com.waya.dto;

/**
 * Created by user on 2018/1/29.
 */
public class LoginExcution {
    private  String userId;
    private int state;
    private String stateInfo;
    public LoginExcution(){}

    public LoginExcution(String userId, int state, String stateInfo) {
        this.userId = userId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "LoginExcution{" +
                "userId='" + userId + '\'' +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}
