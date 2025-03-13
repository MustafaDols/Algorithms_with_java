package Task3;
public class Main {

    public static void main(String[] args) {
        String input = "divideandconquer";
        char target = 'd';
        int count = countCharacter(input, target, 0, input.length() - 1);
        System.out.println("The character '" + target + "' appears " + count + " times.");
    }

    public static int countCharacter(String str, char ch, int start, int end) {
        int count =0;
        if (start == end) {
            if (str.charAt(start) == ch) {
                return 1;
            } else {
                return 0;
            }
        }
        int mid = (start + end) / 2;
        int leftCount = countCharacter(str, ch, start, mid);
        int rightCount = countCharacter(str, ch, mid + 1, end);
        return leftCount + rightCount;
    }
}