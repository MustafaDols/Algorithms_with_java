package cs305;

public class SmallestAndLargest {
    public static void main(String[] args) {
        int [] arr = {1,26,5,65498,1,21,9,3,9,6,21,12,46,431,94,1000};
        smallestAndLargest(arr);
    }
    public static void smallestAndLargest(int []arr){
        int smallest = arr[0];
        int largest  = arr[0];
        for (int i =0; i<arr.length; i++){
            if(arr[i]>largest) largest = arr[i];
            if(arr[i]<smallest) smallest = arr[i];
        }
        System.out.println("The smallest number is : " + smallest);
        System.out.println("The largest number is : " + largest);
    }
}
