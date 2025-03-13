package DivideAndConquer;
import java.util.Arrays;
public class MaxAndMinOfArray {
    public static void main(String[] args) {
        int[] a = {10000,1,2,3,4,-10,-20};
        System.out.println(findMax(a,0,a.length-1));
        System.out.println(findMin(a));
    }
    public static int findMax(int[] array, int left, int right) {
        if (left == right) {
            return array[left];
        }
        int mid = (right + left) / 2;
        int maxLift  = findMax(array, left, mid);
        int maxRight = findMax(array, mid + 1, right);
        return Math.max(maxLift, maxRight);
    }

    public static int findMin(int[] array){
        if (array.length == 1) {
            return array[0];
        }
        int mid = array.length/2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[]rightArray = Arrays.copyOfRange(array, mid, array.length);
        int minLeft  = findMin(leftArray);
        int minRight = findMin(rightArray);
        return Math.min(minLeft, minRight);
        }
    }