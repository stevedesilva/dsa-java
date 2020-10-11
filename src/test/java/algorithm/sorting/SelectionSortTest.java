package algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSortTest {

    @Test
    public void SortZero() {

        int[] nums = new int[]{};
        int[] expected = new int[]{};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortOne() {

        int[] nums = new int[]{0};
        int[] expected = new int[]{0};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortTwo() {

        int[] nums = new int[]{1, 0};
        int[] expected = new int[]{0, 1};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortThree() {

        int[] nums = new int[]{2, 0, 1};
        int[] expected = new int[]{0, 1, 2};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void SortFour() {

        int[] nums = new int[]{2, 0, 4, 1};
        int[] expected = new int[]{0, 1, 2, 4};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }


    @Test
    public void SortAll() {

        int[] nums = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        int[] expected = new int[]{0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(nums);
        assertArrayEquals(expected, nums);
    }


}