package cs305;
import java.util.Arrays;


public class SmallestNumbers {
    public static void main(String[] args) {
        int[] numbers = {100,200,300,400,500,600,700,800};
        int m = 3;
        int[] smallestNumbers = smallestNumbers(numbers,m);
        System.out.println("The " + m + " smallest numbers are: " + Arrays.toString(smallestNumbers));

    }
    public static int []smallestNumbers (int []arr , int m){
        if (arr == null || arr.length == 0 || m > arr.length) {
            throw new IllegalArgumentException("Invalid input");
        }
        int []smallest = new int[m];
        Arrays.sort(arr);
        for (int i =0; i<m ; i++){
            smallest[i] = arr[i];
        }
        return smallest;
    }

}