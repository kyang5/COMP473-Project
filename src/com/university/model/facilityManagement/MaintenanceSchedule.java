package com.university.model.facilityManagement;
import java.util.*;

public class MaintenanceSchedule {
    private Date maintenanceDate;
    private MaintenanceWorker maintenanceWorker;

    public Date getMaintenanceDate(){
        return maintenanceDate;
    }
    public void setMaintenanceDate(Date maintenanceDate){
        this.maintenanceDate = maintenanceDate;

    }
    public MaintenanceWorker getMaintenanceWorker(){
        return maintenanceWorker;
    }
    public void setMaintenanceWorker(MaintenanceWorker maintenanceWorker){
        this.maintenanceWorker = maintenanceWorker;
    }
    }

