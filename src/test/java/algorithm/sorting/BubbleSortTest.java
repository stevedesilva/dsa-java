package algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void SortNumbersIterative() {

        int[] nums = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] expected = new int[]{0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(nums);
        assertArrayEquals(expected,nums);
    }


}