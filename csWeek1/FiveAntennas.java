package csWeek1;
import java.util.Scanner;

 class FiveAntennas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int k = in.nextInt();
        if (e-a>k) {System.out.println(":(");}
        if (e-a<k) {System.out.println("Yay!");}

    }
}
