package com.waya.enums;


public enum LoginStateEnum {

//    SUCCES(1,"预约成功"), NO_NUMBER(0,"没有编号");
SUCCESS(1, "注册成功"), LOGIN_REPEAT(0, "重复注册"),  INNER_ERROR(2, "系统异常");
    private int state;
    private String stateInfo;
    private LoginStateEnum(int state, String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static LoginStateEnum stateof(int index){
        for(LoginStateEnum state:values()){
            if(state.getState()== index){
                return state;
            }
        }
        return null;
    }
}