package algorithm.sorting;

public class MergeSort {

    public int[] sort(int[] arr) {
        // base case
        if (arr == null || arr.length < 2) {
            return arr;
        }
        // split array into right and left
        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // copy
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[i + mid];
        }
        return merge(sort(left), sort(right));
    }

    private int[] merge(int[] left, int[] right) {
        int[] nums = new int[left.length + right.length];
        int idL = 0;
        int idR = 0;
        // while thi
        int counter = 0;
        while (idL < left.length && idR < right.length) {
            if (left[idL] < right[idR]) {
                nums[counter] = left[idL++];
            } else {
                nums[counter] = right[idR++];
            }
            counter++;
        }

        // check left
        while (idL < left.length) {
            nums[counter++] = left[idL++];
        }

        // check right
        while (idR < right.length) {
            nums[counter++] = right[idR++];
        }

        return nums;
    }

}
