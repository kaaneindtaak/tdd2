import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Exercise2Test {
    @Test
    void emptyArray() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {};
        int[] result = exercise2.swapElements(inputArray);
        assertArrayEquals(new int[]{}, result);
    }
    @Test
    void arrayWith1Element() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {44};
        int[] result = exercise2.swapElements(inputArray);
        assertArrayEquals(new int[]{44}, result);
    }
    @Test
    void swappedArrayIsNewArray() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {44};
        int[] result = exercise2.swapElements(inputArray);
        assertNotEquals(inputArray, result);
    }
    @Test
    void arrayOf2Elements() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {44, 4};
        int[] result = exercise2.swapElements(inputArray);
        assertArrayEquals(new int[]{4, 44}, result);
    }
    @Test
    void arrayOf3Elements() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {44, 10, 4};
        int[] result = exercise2.swapElements(inputArray);
        assertArrayEquals(new int[]{4, 10, 44}, result);
    }
    @Test
    void arrayWithNegativeNumbers() {
        Exercise2 exercise2 = new Exercise2();

        int[] inputArray = new int[] {44, -10, 4};
        int[] result = exercise2.swapElements(inputArray);
        assertArrayEquals(new int[]{-10, 44, 4}, result);
    }

}
