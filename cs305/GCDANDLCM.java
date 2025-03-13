package cs305;
public class GCDANDLCM {
    public static void main(String[] args) {

        int a = 144;
        int b = 192;
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static int findLCM(int n,int m){
        return n*m/findGCD(n,m);
    }
}
