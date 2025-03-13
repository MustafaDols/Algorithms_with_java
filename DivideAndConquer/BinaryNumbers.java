package DivideAndConquer;

public class BinaryNumbers {
    public static void main(String[] args) {
        bin("" , 2);
        bin2("" ,2,0,0);
    }
    public static void bin(String s , int n){
        if (s.length()==n){
            System.out.println(s);
            return;
        }
        bin(s+"0" ,n);
        bin(s+"1" ,n);
    }
    public static void bin2(String s , int n , int sum1 , int sum2){
        if (s.length()== 2*n) {
            if (sum1 == sum2) {
                System.out.println(s);
            }
            return;
        }

        bin2(s+"0" ,n,sum1,sum2);
        if (s.length()<n) {
            bin2(s + "1", n , sum1+1,sum2);
        }
        else {
            bin2(s+"1",n,sum1,sum2+1);
        }
    }

}
