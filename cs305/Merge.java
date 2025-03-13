package cs305;
public class Merge {
    public static void main(String[] args) {
        int[]arr1 = {2,4,6,8,10};
        int[]arr2 = {1,2,3,5,7,9};
        int [] merge = Merge(arr1,arr2);
        for (int i : merge) {
            System.out.print(i + " ");
        }
    }
    public static int[] Merge(int[]arr1,int[]arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergeArray = new int[n1 + n2];
        System.arraycopy(arr1, 0, mergeArray, 0, n1);
        System.arraycopy(arr2, 0, mergeArray, n1, n2);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArray[k++] = arr1[i++];
            } else mergeArray[k++] = arr2[j++];
        }
        while (i<arr1.length){
            mergeArray[k++] = arr1[i++];
        }
        while (j<arr2.length){
            mergeArray[k++]=arr2[j++];
        }

        return mergeArray;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

