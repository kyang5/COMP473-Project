package test.java;

import com.university.model.facility.FacilityRoom;
import com.university.model.use.Type;
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
        availableCapacity = null;
        int occupancy;
        double usageRate;
        Date useStartDate;
        Date useEndDate;
        listActualUsage = null;
        listUsers = null;
        facilityRooms = null;
    }

    @org.junit.jupiter.api.Test
    void isAtCapacity() {
    }

    @org.junit.jupiter.api.Test
    void requestAvailableCapacity() {
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