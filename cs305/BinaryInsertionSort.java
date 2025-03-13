package cs305;
import java.util.Arrays;

public class BinaryInsertionSort {
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int position = binarySearch(arr, key, 0, i - 1);
            for (int j = i - 1; j >= position; j--) {
                arr[j + 1] = arr[j];
            }
            arr[position] = key;
        }
    }


    public static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid + 1;
            }
            else if (key < arr[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}

