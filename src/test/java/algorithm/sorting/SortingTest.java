package algorithm.sorting;

import algorithm.sorting.Sorting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void sortNumbers() {
        Sorting sorting = new Sorting();
        final int[] expected = {1, 2, 2, 7, 8, 34, 65};
        final int[] numbers = {2, 65, 34, 2, 1, 7, 8};
        sorting.sortNumbers(numbers);

        assertArrayEquals(expected, numbers);
    }
}