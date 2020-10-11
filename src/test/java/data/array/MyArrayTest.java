package data.array;

import data.array.MyArray;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayTest {

    @Test
    public void mergeSortedArrays() {
        int[] a1 = {0, 3, 4, 31};
        int[] a2 = {4, 6, 30};


        MyArray myArray = new MyArray();

//        int[] want = new int[a1.length + a2.length]{};
        int[] want = {0, 3, 4, 4, 6, 30, 31};
        int[] got = myArray.mergeSortedArray(a1, a2);


        assertArrayEquals(want, got);

    }

    @Test
    public void mergeSortedArraysMoreElementsOnA1() {
        int[] a1 = {0, 3, 4, 31, 45, 99};
        int[] a2 = {4, 6, 30};


        MyArray myArray = new MyArray();

//        int[] want = new int[a1.length + a2.length]{};
        int[] want = {0, 3, 4, 4, 6, 30, 31, 45, 99};
        int[] got = myArray.mergeSortedArray(a1, a2);


        assertArrayEquals(want, got);

    }

    @Test
    public void mergeSortedArraysMoreElementsOnA2() {
        int[] a1 = {4, 6, 30};
        int[] a2 = {0, 3, 4, 31, 45, 99};


        MyArray myArray = new MyArray();

//        int[] want = new int[a1.length + a2.length]{};
        int[] want = {0, 3, 4, 4, 6, 30, 31, 45, 99};
        int[] got = myArray.mergeSortedArray(a1, a2);


        assertArrayEquals(want, got);

    }

    @Test
    public void TestMoveZerosToEndOfArray() {


        int[] want = {1, 3, 12, 0, 0};

        MyArray myArray = new MyArray();

        int[] nums = {0, 1, 0, 3, 12};
        int[] got;

        got = myArray.moveZerosToEndOfArray(nums);
        assertArrayEquals(want, got);


        int[] nums2 = {0, 0, 1, 3, 12};
        got = myArray.moveZerosToEndOfArray(nums2);
        assertArrayEquals(want, got);

        int[] nums3 = {0, 1, 3, 12, 0};
        got = myArray.moveZerosToEndOfArray(nums3);
        assertArrayEquals(want, got);


        int[] nums4 = {1, 0, 3, 12, 0};
        got = myArray.moveZerosToEndOfArray(nums4);
        assertArrayEquals(want, got);

        int[] nums5 = {1, 3, 0, 0, 12};
        got = myArray.moveZerosToEndOfArray(nums5);
        assertArrayEquals(want, got);
    }


    @Test
    public void TestContainsDuplicates_shouldReturnTrue_whenDuplicatesFound() {
        // Input: [1,2,3,1]
        // Output: true
        //
        MyArray myArray = new MyArray();

        boolean result;
        int[] numsDup = {1, 2, 3, 1};
        result = myArray.containsDuplicates(numsDup);
        assertTrue(result);

        int[] numsDup2 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        result = myArray.containsDuplicates(numsDup2);
        assertTrue(result);

        int[] numsNoDup = {1, 2, 3, 4};
        result = myArray.containsDuplicates(numsNoDup);
        assertFalse(result);

    }

    @Test
    public void TestFirstRecurringCharacter() {
        MyArray myArray = new MyArray();

        Optional<Integer> got = myArray.firstRecurringCharacter(new Integer[]{2, 5, 1, 2, 3, 5, 1, 2, 4});

        assertTrue(got.isPresent());
        int want = 2;
        assertEquals(want,got.get());

        got = myArray.firstRecurringCharacter(new Integer[]{2, 1, 1, 2, 3, 5, 1, 2, 4});
        assertTrue(got.isPresent());
        want = 1;
        assertEquals(want, got.get());

        got = myArray.firstRecurringCharacter(new Integer[]{2, 3, 4, 5});
        assertFalse(got.isPresent());
    }
//
//    @Test // need to sort
//    public void TestFirstRecurringCharacterNaive() {
//        MyArray myArray = new MyArray();
//
//        Optional<Integer> got = myArray.firstRecurringCharacterN2(new Integer[]{2, 5, 1, 2, 3, 5, 1, 2, 4});
//
//        assertTrue(got.isPresent());
//        int want = 2;
//        assertEquals(want,got.get());
//
//        got = myArray.firstRecurringCharacterN2(new Integer[]{2, 1, 1, 2, 3, 5, 1, 2, 4});
//        assertTrue(got.isPresent());
//        want = 1;
//        assertEquals(want, got.get());
//
//        got = myArray.firstRecurringCharacterN2(new Integer[]{2, 3, 4, 5});
//        assertFalse(got.isPresent());
//    }
}
