package DivideAndConquer;

public class IsMultiply10_20 {
    public static void main(String[] args) {
        System.out.println( isMulti10_20(1,1000));
        System.out.println( isMulti10_20(1,1001));
    }
    public static boolean isMulti10_20(int start , int end){
        if(start==end){
            return true;
        }
        else if(start>end){
            return false;
        }
        return isMulti10_20(start*10,end) || isMulti10_20(start*20,end);
    }
}
