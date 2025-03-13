package Lab2;
public class QUIZ {
    public static void main(String[] args) {
        int []arr={2,9,15,60,32};
        sort(arr);
    }
    public static void sort(int[]arr){
        int temp=0,temp1=0;
        int []ar=new int[101];
        int []a=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp= arr[i];
            ar[temp+1]=temp;
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]!=0){
                a[temp1]=ar[i];
                temp1++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}