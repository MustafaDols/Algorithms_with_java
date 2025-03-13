package Recursive;

public class PrintArrayElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Print(arr,0);
    }
    public static void Print(int []arr , int index){
        if(index==arr.length){
            return;
        }
        System.out.print("[" + arr[index] + "]");
        Print(arr,index+1);
    }
}
