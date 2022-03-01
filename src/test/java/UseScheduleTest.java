package test.java;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityManager;
import com.university.model.facility.FacilityRoom;
import com.university.model.use.Type;
import com.university.model.use.UseSchedule;
import com.university.model.use.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UseScheduleTest {
    private int availableCapacity;
    private int occupancy;
    private double usageRate;
    private Date useStartDate;
    private Date useEndDate;
    private List<Type> listActualUsage = new ArrayList<>();
    private List<User> listUsers = new ArrayList<>();
    private List<FacilityRoom> facilityRooms = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        int availableCapacity;
        int occupancy;
        double usageRate;
        Date useStartDate;
        Date useEndDate;
        List<Type> listActualUsage = new ArrayList<>();
        List<User> listUsers = new ArrayList<>();
        List<FacilityRoom> facilityRooms = new ArrayList<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        Date useStartDate = null;
        Date useEndDate = null;
        listActualUsage = null;
        listUsers = null;
        facilityRooms = null;
    }

    @org.junit.jupiter.api.Test
    void isAtCapacity() {
    }

    @org.junit.jupiter.api.Test
    void requestAvailableCapacity() {

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
        UseSchedule useSchedule = new UseSchedule();
        useSchedule.setOccupancy(10);
        useSchedule.requestAvailableCapacity(facilityRoom1);
        useSchedule.setUseStartDate(new Date(2020, 12, 1, 13, 45));
        useSchedule.setUseEndDate(new Date(2020, 12, 22, 10, 15));
        useSchedule.requestAvailableCapacity(facilityRoom1);
        assertEquals(10, useSchedule.requestAvailableCapacity(facilityRoom1));
    }

    @org.junit.jupiter.api.Test
    void addFacilityRoom() {
    }

    @org.junit.jupiter.api.Test
    void addUser() {
    }

    @org.junit.jupiter.api.Test
    void vacateFacilityRoom() {
    }

    @org.junit.jupiter.api.Test
    void addActualUsage() {
    }

    @org.junit.jupiter.api.Test
    void removeActualUsage() {
    }

    @org.junit.jupiter.api.Test
    void calculateUsage() {
    }

    @org.junit.jupiter.api.Test
    void timeInterval() {
    }
}