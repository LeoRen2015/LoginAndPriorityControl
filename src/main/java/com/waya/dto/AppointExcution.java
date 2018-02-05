package com.waya.dto;

import com.waya.entity.Appointment;
import com.waya.enums.AppointStateEnum;

/**
 * Created by user on 2018/1/27.
 */
public class AppointExcution {
    private  long bookId;
    private int state;
    private String stateInfo;
    private Appointment appointment;
    public AppointExcution(){}
    //预约失败的构造器
    public AppointExcution(long bookId,AppointStateEnum appointStateEnum){
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
    }

    //预约成功构造器
    public AppointExcution(long bookId,AppointStateEnum appointStateEnum,Appointment appointment){
        this.bookId = bookId;
        this.state = appointStateEnum.getState();
        this.stateInfo = appointStateEnum.getStateInfo();
        this.appointment = appointment;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
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

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "AppointExcution{" +
                "bookId=" + bookId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", appointment=" + appointment +
                '}';
    }
}
