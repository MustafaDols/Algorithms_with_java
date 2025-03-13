package csWeek1;

public class LargestOperation {
    public static void main(String[] args) {
       int a = 13;
       int b = 3;
        System.out.println(Large(a,b));

    }
    public static int Large(int a, int b){
        int dot = a*b;
        int sum = a+b;
        int sub = a-b;
        if (dot>=sum&&dot>=sub) return dot;
        if (sum>=dot&&sum>=sub) return sum;
        return sub;
    }

}
