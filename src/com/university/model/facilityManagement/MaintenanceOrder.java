package com.university.model.facilityManagement;
import com.university.model.facility.FacilityLocation;

import java.util.*;
//TODO write get and set method for facility.
public class MaintenanceOrder {
    private String orderType;
    private int orderID;
    private Date orderDate;
    private Time orderTime;
    private double cost;
    public FacilityLocation facilityLocation;
//product location
    //quantity maintenance orders list
    public double getCost(){
        return cost;
    }
    public void setCost(){
        this.cost = cost;
    }

    public String getOrderType() {
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
