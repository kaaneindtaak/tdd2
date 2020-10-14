import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void calculateSum_null() {
        Exercise1 ex = new Exercise1();
        int result = ex.calculateSum(null);
        assertEquals(0, result);
    }
    @Test
    void calculateSum_empty() {
        Exercise1 ex = new Exercise1();
        int result = ex.calculateSum(new int[]{});
        assertEquals(0, result);
    }
    @Test
    void calculateSum() {
        Exercise1 ex = new Exercise1();
        int result = ex.calculateSum(new int[]{1, 2, 3, 4});
        assertEquals(10, result);
    }
}