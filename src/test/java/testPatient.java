import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testPatient {
    Patient myP;
    /*
    @BeforeEach
    void setup() {
        Patient myP;
    }
    */
    @Test
    void testGivenNameSuccess() {
        assertEquals("Bartek", myP.givenName);
    }
    @Test
    void testGivenNameFailure() {
       Exception ex = assertThrows(IllegalArgumentException.class, ()-> {});
       assertEquals("Minimum 3 characters required", ex.getMessage());
    }

    @Test
    void testFamilyNameSuccess() {
        assertEquals("Drapinski", myP.familyName);
    }
    @Test
    void testFamilyNameFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {});
        assertEquals("Minimum 3 characters required", ex.getMessage());
    }

    @Test
    void testHSEnumSuccess() {
        assertEquals("4281940000", myP.HSEnum);
    }
    @Test
    void testHSEnumFailure() {
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {});
        assertEquals("Must be exactly 10 numeric characters", ex.getMessage());
    }

    @Test
    void testAgeSuccess() {
        assertEquals(20, myP.age);
    }
    @Test
    void testAgeFailure() {
        Exception ex =assertThrows(IllegalArgumentException.class, ()-> {});
        assertEquals("Must be between 0 and 120", ex.getMessage());
    }

}
