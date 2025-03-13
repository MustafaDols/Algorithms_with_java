package cs305;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        Integer []arr ={1,2,3};
        System.out.println(LinearSearch(arr,5,0));
    }
    int i =0;
    public static <T> boolean LinearSearch(T arr[] , T number ,int index)  {
        if(index== arr.length) return false;
        if(arr[index].equals(number)) return true;
        return LinearSearch(arr,number,index+1);

    }

}
