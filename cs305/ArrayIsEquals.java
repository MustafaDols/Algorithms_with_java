package cs305;

public class ArrayIsEquals {
    public static void main(String[] args) {
        Integer []arr1 ={1,2,3};
        Integer []arr2 ={1,2,3};
        System.out.println(isEquals(arr1,arr2));

    }
    public static  <T>  boolean isEquals(T arr1[] , T []arr2){
        if(arr1==null || arr2==null) return false;
        if (arr1.getClass()!=arr2.getClass()) return false;
        if(arr1.length != arr2.length) return false;

       for (int i=0; i<arr1.length ; i++){
           if(!arr1[i].equals(arr2[i])) return false;
       }

       return true;
    }
}