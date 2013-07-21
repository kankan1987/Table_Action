package com.ygsoft.xiekang.model;

import java.io.Serializable;
import java.util.Calendar;


public class Kstable {
    private static final long serialVersionUID = 1L;
    
    private int accBookId;
    private String accBookName;
    private String stopFlag;
    private Calendar eTime;
    private Calendar sTime;
    private int AccBookBz;
    public int getAccBookId() {
        return accBookId;
    }
    public void setAccBookId(int accBookId) {
        this.accBookId = accBookId;
    }
    public String getAccBookName() {
        return accBookName;
    }
    public void setAccBookName(String accBookName) {
        this.accBookName = accBookName;
    }
    public String getStopFlag() {
        return stopFlag;
    }
    public void setStopFlag(String stopFlag) {
        this.stopFlag = stopFlag;
    }
    public Calendar geteTime() {
        return eTime;
    }
    public void seteTime(Calendar eTime) {
        this.eTime = eTime;
    }
    public Calendar getsTime() {
        return sTime;
    }
    public void setsTime(Calendar sTime) {
        this.sTime = sTime;
    }
    public int getAccBookBz() {
        return AccBookBz;
    }
    public void setAccBookBz(int accBookBz) {
        AccBookBz = accBookBz;
    }
}
