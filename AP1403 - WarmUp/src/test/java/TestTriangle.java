import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestTriangle {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testTriangle0() {
        char[][] expected = {
                {'*'},
                {'*', '*'}
        };
        assertArrayEquals(expected, ex.generateTriangle(2));
    }

    @Test
    void testTriangle1() {
        char[][] expected = {
                {'*'},
                {'*', '*'},
                {'*', ' ', '*'},
                {'*', '*', '*', '*'}
        };
        assertArrayEquals(expected, ex.generateTriangle(4));
    }

    @Test
    void testTriangle2() {
        char[][] expected = {
                {'*'},
                {'*', '*'},
                {'*', ' ', '*'},
                {'*', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', ' ', '*'},
                {'*', ' ', ' ', ' ', ' ', ' ', '*'},
                {'*', '*', '*', '*', '*', '*', '*', '*'}
        };
        assertArrayEquals(expected, ex.generateTriangle(8));
    }

    @Test
    void testTriangle3() {
        char[][] expected = {};
        assertArrayEquals(expected, ex.generateTriangle(0));
    }
}
