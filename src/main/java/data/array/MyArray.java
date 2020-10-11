package data.array;

import java.util.*;

public class MyArray {


    public static void main(String[] args) {
        char[] myArray = new char[]{'a', 'b', 'c', 'd', 'e'};
        List<Character> myList = new ArrayList<>() {
            {
                add('a');
                add('b');
                add('c');
                add('d');
                add('e');
            }
        };

        // push
        myList.add('f');
        System.out.println(myList);

        int len = myArray.length;
        System.out.println(myArray);

        int result = 1 % 5;

        // pop
        myList.get(0);

        int[] numbers = {1, 2, 3, 4};


    }


    public int[] mergeSortedArray(int[] a1, int[] a2) {
        // validation
        if (a1 == null || a1.length <= 0 || a2 == null || a2.length <= 0) {
            return new int[]{};
        }

        int totalLen = a1.length + a2.length;
        int[] result = new int[totalLen];

        int idxA1 = 0;
        int idxA2 = 0;
        // we need to track both counters
        //   int[] a1 = {0, 3, 4, 31};
        //   int[] a2 = {4, 6, 30};
        for (int i = 0; i < totalLen; i++) {

            // More to process on a2
            if (idxA1 >= a1.length || idxA2 >= a2.length) {
                System.out.println("More to processing to do");
                // More to process on a1
                if (idxA2 >= a2.length) {
                    System.out.println("finished a2");

                    if (idxA1 < a1.length) {
                        System.out.println("More to process on a1");

                        result[i] = a1[idxA1];
                        idxA1++;
                    }

                } else {
                    System.out.println("finished a1 process a2");
                    if (idxA2 < a2.length) {
                        result[i] = a2[idxA2];
                        idxA2++;
                    }
                }

//                return result;


            } else {
                System.out.println("Merging ...");


                if (a1[idxA1] < a2[idxA2]) {
                    result[i] = a1[idxA1];
                    System.out.printf("Add a1[idxA1] %d\n", result[i]);
                    idxA1++;
                } else {
                    result[i] = a2[idxA2];
                    System.out.printf("Add a1[idxA2] %d\n", result[i]);
                    idxA2++;
                }
            }


        }
        return result;
    }


//    public int[] moveZerosToEndOfArray(int[] nums) {
//        // Input: [0,1,0,3,12]
//        // Input: [0,0,1,3,12]
//        // Output: [1,3,12,0,0]
//        //
//        for (int i = nums.length - 1; i >= 0; i--) {
//
//            int count = i;
//            // Input: [0,1,0,3,12]
//            // 4: [1,0,3,0,12]
//            // 3: [1,3,0,12,0]
//            // 2: [1,3,12,0,0]
//            // 1: [1,3,12,0,0]
//            // 1: [1,3,12,0,0]
//            System.out.printf("Processing ... counter is \t %d\n", count);
//            // find zero
//            if (nums[i] == 0 && i < nums.length -1) {
//                // swap if number not zero
//                int t = nums[i + 1];
//                if (t != 0) {
//                    nums[i + 1] = nums[i];
//                    nums[i] = t;
//                    // move counter back?
//                    i = nums.length-1;
//                    // move to back
//                    System.out.printf("swapped, counter is \t %d\n", i);
//                } else {
//                    System.out.printf("not swapped zero value, counter is \t %d\n", i);
//                }
//
//
//                // don't count last item
//            }
//        }
//        return nums;
//    }

//    public int[] moveZerosToEndOfArray(int[] nums) {
//        // Input: [0,1,0,3,12]
//        // Input: {1, 3, 0, 0, 12};
//        // Output: [1,3,12,0,0]
//        //
//        int anchor = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                // swap
//                int temp = nums[anchor];
//                nums[anchor] = nums[i];
//                nums[i] = temp;
//                // incr anchor for non digits only
//                anchor++;
//            }
//        }
//
//        return nums;
//    }


    public int[] moveZerosToEndOfArray(int[] nums) {
        // Input: [0,1,0,3,12] a=0; c=0
        //        [0,1,0,3,12] a=0 c=1,
        //        [1,0,0,3,12] a=1 c=1, swap
        //        [1,0,0,3,12] a=1 c=2,
        //        [1,0,0,3,12] a=1 c=3,
        //        [1,3,0,0,12] a=2 c=3, swap
        //        [1,3,0,0,12] a=2 c=4
        //        [1,3,12,0,0] a=3 c=4  swap
        //        [1,3,12,0,0] a=3 c=5 exit


        int zeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // if we have a number then swap
                // swapping number with anchor keeps number in same place
                int temp = nums[i];
                nums[i] = nums[zeroIdx];
                nums[zeroIdx] = temp;
                zeroIdx++;
            }
        }
        // Output: [1,3,12,0,0]


        return nums;
    }


    public boolean containsDuplicates(int[] nums) {
        Set<Integer> values = new HashSet<>(nums.length);
        for (Integer num : nums) {
            if (values.contains(num)) return true;
            values.add(num);
        }
        return false;
    }

    public Optional<Integer> firstRecurringCharacter(Integer[] nums) {
        Set<Integer> chars = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (chars.contains(nums[i]))
                return Optional.ofNullable(nums[i]);
            chars.add(nums[i]);
        }

        return Optional.empty();
    }

    public Optional<Integer> firstRecurringCharacterN2(Integer[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // ignore current index of char being compared
                if (nums[i].equals(nums[j])) {
                    return Optional.ofNullable(nums[i]);
                }


            }
        }

        return Optional.empty();
    }

}

