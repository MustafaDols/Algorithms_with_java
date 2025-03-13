package DivideAndConquer;

public class SumOfLastN {
    public static void main(String[] args) {
        System.out.println(sumOfN(new int[]{1,2,3,4,5,6,7,8,9},3));
        System.out.println(recSumOfN(new int[]{1,2,3,4,5,6,7,8,9},3));
    }
    public static int sumOfN(int[]arr , int n){
        int sum =0;
        for (int i = arr.length-n;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int recSumOfN(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[arr.length - n] + recSumOfN(arr, n - 1);
    }

}
