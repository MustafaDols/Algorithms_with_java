package Lab2;

import java.util.Arrays;

public class Quiz2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int result = findIndex(arr,15);
        System.out.println(result);

    }
    public static int findIndex(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int mid =0;
        while (start<=end){
            mid = (start+end)/2;
            if (arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                end = mid-1;
            else if(arr[mid]<key)
                start =mid+1;
        }

        return start;
    }
}

