package com.university.model.facilityManagement;
import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;

import java.util.*;

public class MaintenanceOrder {
    private String orderType;
    private int orderID;
    private Date orderDate;
    private double cost;
    public FacilityRoom facilityRoom;

    public MaintenanceOrder(FacilityRoom room){
        this.facilityRoom = room;

    }

    //product location
    //quantity maintenance orders list
    public double getCost() {
        return cost;
    }

    public void setCost() {
        this.cost = cost;
    }

    public String getOrderType() {
        return orderType;
    }

    public int getOrderID() {
        return orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;

    }

    public FacilityRoom getFacilityRoom() {
        return facilityRoom;
    }


    public void setFacilityRoom(FacilityRoom facilityRoom) {
        this.facilityRoom = facilityRoom;
    }

}
