import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPrime {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testPrime0() {
        assertFalse(ex.isPrime(1));
    }

    @Test
    void testPrime1() {
        assertTrue(ex.isPrime(41));
    }

    @Test
    void testPrime2() {
        assertFalse(ex.isPrime(2455));
    }

    @Test
    void testPrime3() {
        assertTrue(ex.isPrime(2147483647));
    }
}
