package cs305;

public class ReverseArray {
    public static void main(String[] args) {
        Integer [] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        printArray(myArray);

        reverseArray(myArray);

        System.out.println("Reversed array: ");
        printArray(myArray);
    }
        public static <T> void reverseArray(T [] array) {
            int left = 0;
            int right = array.length - 1;

            while (left < right) {
                T temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }



        public static <T> void printArray(T [] array) {
            for (T value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

