package Algorithms;

import java.util.Arrays;

public class MergeThreeArrays {

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4};
        int[] arr2 = {2, 8, 5};
        int[] arr3 = {7, 6, 9};

        int[] sortedResult = mergeSortThreeArrays(arr1, arr2, arr3);
        System.out.println(Arrays.toString(sortedResult));
    }

    public static int[] mergeSortThreeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int[] combined = new int[arr1.length + arr2.length + arr3.length];
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, combined, arr1.length + arr2.length, arr3.length);
        return mergeSort(combined);
    }

    private static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] leftHalf = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] rightHalf = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(leftHalf, rightHalf);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sortedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sortedArray[k++] = left[i++];
            } else {
                sortedArray[k++] = right[j++];
            }
        }

        while (i < left.length) {
            sortedArray[k++] = left[i++];
        }
        while (j < right.length) {
            sortedArray[k++] = right[j++];
        }

        return sortedArray;
    }
}