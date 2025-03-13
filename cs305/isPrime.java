package cs305;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
    public static boolean isPrime( int p){
        for (int i =2; i<Math.sqrt(p);i++){
            if (p%i==0)  return false;
        }
        return true;
    }
}
