package algorithm.sorting;

public class InsertionSort {
    // 99, 44, 6, 2, 1, 0, 4 = 7 -1 = 6
    //                  i   j
    public void __sort(int[] nums) {
        // only run for nums > 2
        for (int i = 0; i < nums.length - 1; i++) {
            /*
              j (instead of i) is used for the loop.
              current and previous position are represented by j since we need to update this positions for each swap
             */
            int j = i + 1;
            while (j > 0 && nums[j - 1] > nums[j]) {
                // swap
                int curr = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = curr;
                // check prev pos
                j--;
            }
        }

    }


    public void sort(int[] arr) {
        // return array if length 0 or 1
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1; // previous idx
            int key = arr[i]; // current key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public int[] _sort(int[] in) {
        // for each n, compare
        for (int i = 0; i < in.length - 1; i++) {
            swap(in, i);
        }
        return in;
    }

    private void swap(int[] in, int i) {
        while (i >= 0 && in[i] > in[i + 1]) {
            // swap
            int temp = in[i];
            in[i] = in[i + 1];
            in[i + 1] = temp;
            i--;
        }

    }


}
