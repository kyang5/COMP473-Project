package com.university.view;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityManager;
import com.university.model.facility.FacilityRoom;
import com.university.model.facilityManagement.*;
import com.university.model.use.Type;
import com.university.model.use.UseSchedule;
import com.university.model.use.User;

public class FacilityClient {
    public static void main(String[] args) throws Exception{

        FacilityLocation facilityLocation = new FacilityLocation();
        facilityLocation.setFacilityId(1);
        facilityLocation.setName("Murphy Building");
        facilityLocation.setAddressNumber(123);
        facilityLocation.setStreetName("State Street");
        facilityLocation.setCity("Chicago");
        facilityLocation.setZipcode(123456);

        FacilityManager facilityManager = new FacilityManager();
        facilityManager.setManagerId(1);
        facilityManager.setManagerFirstName("Bob");
        facilityManager.setManagerLastName("Doe");
        facilityLocation.setFacilityManager(facilityManager);
        facilityManager.addFacilities(facilityLocation);

        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);
        facilityRoom1.setFacilityLocation(facilityLocation);
        facilityLocation.addFacilityRoom(facilityRoom1);

        Inspector inspector = new Inspector();
        inspector.setInspectorID(1);
        inspector.setInspectorFirstName("Dan");
        inspector.setInspectorLastName("Tan");
        inspector.setInspectorTitle("Fire Safety Inspector");

        Inspection inspection = new Inspection();
        inspection.setInspectionID(1);
        inspection.setInspectionName("Fire safety");
        inspection.setInspector(inspector);
        inspection.setFacilityRoom(facilityRoom1);
        inspection.addInspector(inspector);

        MaintenanceRequest request = new MaintenanceRequest();
        request.setRequestType("Plumbing");
        request.setRequestID(1);
        request.setRequestorID(1);
        request.setProblem("Leaking pipes");
        request.setRequestStatus("Open");
        request.setFacilityRoom(facilityRoom1);


        MaintenanceOrder order = new MaintenanceOrder();
        order.setOrderType("Urgent");
        order.setOrderID(1);
        //order.setOrderDate(2021, 03, 10, 23, 45);
        order.setCost(100.0);
        order.setFacilityRoom(facilityRoom1);

        MaintenanceWorker worker = new MaintenanceWorker();
        worker.setMaintWorkerID(1);
        worker.setMaintFirstName("Bob");
        worker.setMaintLastName("Bob");
        worker.setMaintTitle("Senior Electrician");

        MaintenanceSchedule schedule = new MaintenanceSchedule();
        //schedule.setMaintenanceEndDate();
        //schedule.setMaintenanceStartDate();
        schedule.setMaintenanceWorker(worker);
        schedule.setFacilityRoom(facilityRoom1);

        MaintenanceLog maintenanceLog = new MaintenanceLog();
        maintenanceLog.addInspection(inspection);
        maintenanceLog.addMaintenanceOrder(order);
        maintenanceLog.addMaintenanceRequest(request);
        maintenanceLog.scheduleMaintenance(schedule);
        maintenanceLog.calcMaintenanceCostForFacility(facilityLocation);
        maintenanceLog.calcDownTimeForFacilityRoom(facilityRoom1);

        Type type = new Type();
        type.setFacilityUseType("Lab");
        type.setFacilityRoom(facilityRoom1);

        User user = new User();
        user.setUserFirstName("Bob");
        user.setUserLastName("Tom");
        user.setUserId(1);
        user.setUserTitle("Professor");
        user.setFacilityRoom(facilityRoom1);

        UseSchedule useSchedule = new UseSchedule();
        useSchedule.setOccupancy(10);
        useSchedule.requestAvailableCapacity(facilityRoom1);
        //useSchedule.setUseStartDate();
        //useSchedule.setUseEndDate();
        useSchedule.addFacilityRoom(facilityRoom1);
        useSchedule.addActualUsage(type);
        useSchedule.addUser(user);


    }
}
