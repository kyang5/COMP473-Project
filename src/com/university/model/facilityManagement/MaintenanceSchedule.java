package com.university.model.facilityManagement;
import java.util.*;

public class MaintenanceSchedule {
    private Date maintenanceDate;
    private Time maintenanceTime;
    public Date getMaintenanceDate(){
        return maintenanceDate;
    }
    public Time getMaintenanceTime(){
        return maintenanceTime;
    }
    public void setMaintenanceDate(Date mantenanceDate){
        this.maintenanceDate = maintenanceDate;

    }
    public void setMaintenanceTime(Time maintenanceTime){
        this.maintenanceTime = maintenanceTime;


    }
}
