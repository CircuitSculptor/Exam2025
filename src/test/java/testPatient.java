import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPatient {
    Patient myP;
    @BeforeEach
    void setup() {
        myP = new Patient ();
    }
    @Test
    void testGivenNameSuccess() {
        assertEquals("Bartek", myP.givenName);
    }
    @Test
    void testFamilyNameSuccess() {
        assertEquals("Drapinski", myP.familyName);
    }
    @Test
    void testHSEnumSuccess() {
        assertEquals("4281940000", myP.HSEnum);
    }
    @Test
    void testAgeSuccess() {
        assertEquals(20, myP.age);
    }

}
