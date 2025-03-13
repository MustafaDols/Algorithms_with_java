package Task3;

public class Main2 {
    public static void main(String[] args) {
        String s = "omar";
        char c = 'o';
        System.out.println(isHere3(s,c));
        String s2 = "Mustafa";
        char c2 = 'x';
        System.out.println(isHere3(s2,c));
        System.out.println(f(s2, 'a',0,s.length()));

    }
    public static boolean isHere(String s, char c) {
        if (s.length() == 1) {
            return s.charAt(0) == c;
        }

        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2, s.length());

        return isHere(s1, c) || isHere(s2, c);
    }

    public static boolean isHere2(String s, char c, int start, int end) {
        if (start > end) {
            return false;
        }

        if (start == end) {
            return s.charAt(start) == c;
        }

        int mid = (start + end) / 2;
        return isHere2(s, c, start, mid) || isHere2(s, c, mid + 1, end);
    }
    public static boolean isHere3(String s, char c){
       return isHere2(s,c,0,s.length()-1);
    }

    public static int f(String s, char c, int l, int r) {
        if (s == null || s.isEmpty() || l < 0 || r >= s.length() || l > r) {
            return 0;
        }
        if (l == r) {
            if (s.charAt(l) == c) {
                return 1;
            } else {
                return 0;
            }
        }
        int mid = (l + r) / 2;
        return f(s, c, l, mid) + f(s, c, mid + 1, r);
    }


}
