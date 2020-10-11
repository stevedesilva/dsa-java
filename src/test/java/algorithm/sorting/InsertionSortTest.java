package algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    public void SortZero() {

        int[] nums = new int[]{};
        int[] expected = new int[]{};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortOne() {

        int[] nums = new int[]{0};
        int[] expected = new int[]{0};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortTwo() {

        int[] nums = new int[]{1, 0};
        int[] expected = new int[]{0, 1};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortThree() {

        int[] nums = new int[]{2, 0, 1};
        int[] expected = new int[]{0, 1, 2};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortFour() {

        int[] nums = new int[]{2, 0, 4, 1};
        int[] expected = new int[]{0, 1, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortFive() {

        int[] nums = new int[]{99, 44, 6, 2, 1, 0, 4};
        int[] expected = new int[]{0, 1, 2, 4, 6, 44, 99};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }


    @Test
    public void SortAll() {

        int[] nums = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] expected = new int[]{0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }


}