package cs305;
import java.util.Arrays;
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5};
        int k = 5;
        int[] sortedArray = countingSort(arr, k);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
    public static int[] countingSort(int[] arr, int k) {
        int n = arr.length;
        int[] count = new int[k + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int[] sortedArray = new int[n];
        int index = 0;
        for (int i = 1; i <= k; i++) {
            while (count[i] > 0) {
                sortedArray[index++] = i; 
                count[i]--;
            }
        }

        return sortedArray;
    }
}

