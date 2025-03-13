package Lab2;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(LargestNumber(arr));
        System.out.println(LargestNumber(arr));

    }
    public static int LargestNumber(int []arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int largest=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        return largest;
    }


    public static int LargestNumber2(int []arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Arrays.sort(arr);
        return arr[arr.length-1];

        }


}
