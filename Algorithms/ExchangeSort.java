package Algorithms;
public class ExchangeSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        exchangeSort(arr);

        System.out.println("\nSorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void exchangeSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
