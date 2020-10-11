package algorithm.sorting;

public class MergeSort {

    public int[] sort(int[] arr) {
        // base case
        if (arr == null || arr.length < 2) {
            return arr;
        }
        // split array into right and left
        int mid = arr.length /2;
        int[] left = new int[mid -1];
        int[] right = new int[mid];

        // copy
        for()
            return merge(
                    sort(left), sort(right)
            );
    }

    private int[] merge(int[] left, int[] right) {
        return null;
    }

}
