package Algorithms;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,25,34,67,85,105,364,725,1250,1966};
        System.out.println(binSearch(arr,1966));
    }
    public static int binSearch(int[] arr , int key){
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        while (start<=end){
            mid = (start+end)/2;
            if (arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end = mid-1;
            else
                start =mid+1;
        }
        return mid;
    }


}
