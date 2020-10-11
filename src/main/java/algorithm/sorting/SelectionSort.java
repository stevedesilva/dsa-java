package algorithm.sorting;

public class SelectionSort {

    public int[] sort(int[] input) {
        // find the smallest for each n
        for (int i = 0; i < input.length; i++) {
            int smallest = i; // set smallest to first position initially
            for (int j = i; j < input.length; j++) { // no need to compare last item
                if(input[j] < input[smallest]) {
                    smallest = j;
                }
            }
            // swap start with smallest for this loop
            int temp = input[i];
            input[i] = input[smallest];
            input[smallest] = temp;
        }
        return input;
    }

}
