package cs305;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(20));
        System.out.println(fib2(20));
    }
    public static int fib(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        else
            return fib(num-1)+fib(num-2);
    }
    public static int fib2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }
}



