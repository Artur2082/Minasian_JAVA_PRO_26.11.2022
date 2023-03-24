package U_Working_With_Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysClassTest {

    @Test
    public void shouldReturnNull() {
        Assertions.assertNull(ArraysClass.checkArray(null));
    }

    @Test
    public void shouldReturnEmptyArray() {
        int[] array = {1, 4, 1, 4, 1, 4};
        int[] result = {};
        Assertions.assertArrayEquals(result, ArraysClass.checkArray(array));
    }

    @Test
    void shouldTrowRuntimeException() {
        int[] array = {2, 3, 5};
        Assertions.assertThrows(RuntimeException.class, () -> ArraysClass.checkArray(array));
    }

    @Test
    void shouldReturnValuesInArrayAfterLastNumberFour() {
        int[] array = {1, 2, 4, 4, 2, 3, 1, 7};
        int[] result = {2, 3, 1, 7};
        Assertions.assertArrayEquals(result, ArraysClass.checkArray(array));
    }

    @Test
    void shouldReturnFalse() {
        int[] array = {1, 2, 3, 5, 6};
        int[] array1 = null;
        int[] array2 = {};
        Assertions.assertFalse(ArraysClass.checkArray2(array));
        Assertions.assertFalse(ArraysClass.checkArray2(array1));
        Assertions.assertFalse(ArraysClass.checkArray2(array2));
    }

    @Test
    void shouldReturnTrue() {
        int[] array = {1, 1, 1};
        int[] array1 = {4, 4};
        int[] array2 = {4, 1, 4};
        Assertions.assertTrue(ArraysClass.checkArray2(array));
        Assertions.assertTrue(ArraysClass.checkArray2(array1));
        Assertions.assertTrue(ArraysClass.checkArray2(array2));
    }
}
