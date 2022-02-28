package test.java;

import com.university.model.facility.FacilityLocation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FacilityManagerTest {

    private List<FacilityLocation> locationList;

    @BeforeEach
    void setUp() throws Exception{
        locationList = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        locationList = null;
    }

    @Test
    void addFacilities() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);
        locationList.addFacilityLocation(facility); // TODO resolve issue
        assertEquals(facility, locationList.get(0).intValue());
    }

    @Test
    void removeFacilities() {
        FacilityLocation facility = new FacilityLocation();
        facility.setFacilityId(1);
        facility.setName("Murphy Building");
        facility.setAddressNumber(123);
        facility.setStreetName("State Street");
        facility.setCity("Chicago");
        facility.setZipcode(123456);
        locationList.addFacilityLocation(facility);
        locationList.removeFacilityLocation(facility);
        assertTrue(locationList.isEmpty());
    }
}