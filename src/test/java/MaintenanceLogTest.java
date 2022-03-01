package test.java;

import com.university.model.facility.FacilityRoom;
import com.university.model.facilityManagement.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceLogTest {
    private List<MaintenanceOrder> maintenanceList = new ArrayList<MaintenanceOrder>();
    private List<MaintenanceSchedule> scheduleList = new ArrayList<>();
    private List<MaintenanceRequest> requestList = new ArrayList<>();
    private List<Inspection> inspectionList = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        maintenanceList = new ArrayList<MaintenanceOrder>();
        scheduleList = new ArrayList<>();
        requestList = new ArrayList<>();
        inspectionList = new ArrayList<>();

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        maintenanceList = null;
        scheduleList = null;
        requestList = null;
        inspectionList = null;
    }

    @org.junit.jupiter.api.Test
    void addInspection() {
    }

    @org.junit.jupiter.api.Test
    void removeInspection() {
    }

    @org.junit.jupiter.api.Test
    void addMaintenanceRequest() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceRequest request = new MaintenanceRequest();
        request.setRequestType("Plumbing");
        request.setRequestID(1);
        request.setRequestorID(1);
        request.setProblem("Leaking pipes");
        request.setRequestStatus("Open");
        request.setFacilityRoom(facilityRoom1);
        requestList.add(request);
        assertEquals(true, requestList.contains(request));
    }

    @org.junit.jupiter.api.Test
    void cancelMaintenanceRequest() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceRequest request = new MaintenanceRequest();
        request.setRequestType("Plumbing");
        request.setRequestID(1);
        request.setRequestorID(1);
        request.setProblem("Leaking pipes");
        request.setRequestStatus("Open");
        request.setFacilityRoom(facilityRoom1);
        requestList.remove(request);
        assertEquals(true, requestList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void scheduleMaintenance() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceWorker worker = new MaintenanceWorker();
        worker.setMaintWorkerID(1);
        worker.setMaintFirstName("Bob");
        worker.setMaintLastName("Bob");
        worker.setMaintTitle("Senior Electrician");

        MaintenanceSchedule schedule = new MaintenanceSchedule();
        schedule.setMaintenanceEndDate(new Date(2021, 02, 02, 8, 30));
        schedule.setMaintenanceStartDate(new Date(2021, 01, 25, 9,56));
        schedule.setMaintenanceWorker(worker);
        schedule.setFacilityRoom(facilityRoom1);

        scheduleList.add(schedule);
        assertEquals(true, scheduleList.contains(schedule));
    }

    @org.junit.jupiter.api.Test
    void cancelSchedule() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceWorker worker = new MaintenanceWorker();
        worker.setMaintWorkerID(1);
        worker.setMaintFirstName("Bob");
        worker.setMaintLastName("Bob");
        worker.setMaintTitle("Senior Electrician");

        MaintenanceSchedule schedule = new MaintenanceSchedule();
        schedule.setMaintenanceEndDate(new Date(2021, 02, 02, 8, 30));
        schedule.setMaintenanceStartDate(new Date(2021, 01, 25, 9,56));
        schedule.setMaintenanceWorker(worker);
        schedule.setFacilityRoom(facilityRoom1);

        scheduleList.remove(schedule);
        assertEquals(true, scheduleList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void addMaintenanceOrder() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceOrder order = new MaintenanceOrder();
        order.setOrderType("Urgent");
        order.setOrderID(1);
        order.setOrderDate(new Date(2021, 03, 01, 16, 45));
        order.setCost(100.0);
        order.setFacilityRoom(facilityRoom1);

        maintenanceList.add(order);
        assertEquals(true, maintenanceList.contains(order));
    }

    @org.junit.jupiter.api.Test
    void cancelMaintenanceOrder() {
        FacilityRoom facilityRoom1 = new FacilityRoom();
        facilityRoom1.setFacilityRoomId(1);
        facilityRoom1.setPhoneNumber(123-456-7890);
        facilityRoom1.setCapacity(10);
        facilityRoom1.setInUse(true);

        MaintenanceOrder order = new MaintenanceOrder();
        order.setOrderType("Urgent");
        order.setOrderID(1);
        order.setOrderDate(new Date(2021, 03, 01, 16, 45));
        order.setCost(100.0);
        order.setFacilityRoom(facilityRoom1);

        maintenanceList.remove(order);
        assertEquals(true, maintenanceList.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void calcMaintenanceCostForFacility() {
    }
}