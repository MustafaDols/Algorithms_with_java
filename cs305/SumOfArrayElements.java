package cs305;

public class SumOfArrayElements {
    public static void main(String[] args) {

        System.out.println(sum(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    public static int sum(int []arr){
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
