package csWeek1;

import java.util.Scanner;

class MultiplyTwoIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if (x>9 || x<1 ) System.out.println(-1);
        else if (y>9 || y<1 ) System.out.println(-1);
        else System.out.println(x*y);
    }
}
