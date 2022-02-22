package com.university.model.facilityManagement;
import java.util.*;
public class MaintenanceOrder {
    private String orderType;
    private int orderID;
    private Date orderDate;
    private Time orderTime;

    public String getOrderType(){
        return orderType;
    }
    public int getOrderID(){
        return orderID;
    }
    public Date getOrderDate(){
        return orderDate;
    }
    public Time getOrderTime(){
        return orderTime;
    }
    public void setOrderType(String orderType){
        this.orderType = orderType;
    }
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;

    }
    public void setOrderTime(Time orderTime){
        this.orderTime = orderTime;
    }

}
