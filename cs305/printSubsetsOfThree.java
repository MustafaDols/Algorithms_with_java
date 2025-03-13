package cs305;
import java.util.List;
import java.util.ArrayList;
public class printSubsetsOfThree {
    public static void main(String[] args) {

        subset(0,new  int []{1,2,3,4,5});
        System.out.println("-----------------------------------------------------------------------------------------");
//        int[] elements = {1, 2, 3, 4, 5};
//        printSubsetsOfThree(elements);
//
//        System.out.println("-----------------------------------------------------------------------------------------");
//
//
//        List<Integer> inputList = new ArrayList<>();
//        inputList.add(1);
//        inputList.add(2);
//        inputList.add(3);
//        inputList.add(4);
//        inputList.add(5);
//        printSubsets(inputList);
    }
    static ArrayList<Integer> sub = new ArrayList<>();

    public static void subset(int i, int[] arr) {
        if (i == arr.length) {
            if (sub.size() == 3) {
                for (Integer j : sub)
                    System.out.print(j + " ");
                System.out.println();
            }
            return;
        }

        sub.add(arr[i]);
        subset(i + 1, arr);
        sub.remove(sub.size() - 1);
        subset(i + 1, arr);
    }

    public static void printSubsetsOfThree(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            System.out.println("The list has fewer than 3 elements.");
            return;
        }
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    System.out.println("{" + arr[i] + ", " + arr[j] + ", " + arr[k] + "}");
                }
            }
        }
    }


    public static void printSubsets(List<Integer> inputList) {
        List<List<Integer>> subsets = new ArrayList<>();

        for (int i = 0; i < inputList.size() - 2; i++) {
            for (int j = i + 1; j < inputList.size() - 1; j++) {
                for (int k = j + 1; k < inputList.size(); k++) {
                    List<Integer> subset = new ArrayList<>();
                    subset.add(inputList.get(i));
                    subset.add(inputList.get(j));
                    subset.add(inputList.get(k));
                    subsets.add(subset);
                }
            }
        }
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
