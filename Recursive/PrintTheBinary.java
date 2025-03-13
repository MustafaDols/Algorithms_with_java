package Recursive;

public class PrintTheBinary {
    public static void main(String[] args) {
        printBinary(15);
    }
    public static void printBinary(int n){
        if (n==0){
            return;
        }
        printBinary(n/2);
        System.out.print(n%2);
    }
}
