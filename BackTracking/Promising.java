package BackTracking;

class promising {
    static int[] col;
    static int n;

    public static void main(String[] args) {
        n = 8;
        col = new int[n + 1];
        queens(0);
    }

    static void queens(int i) {
        if (promising(i)) {
            if (i == n) {
                printSolution();
            } else {
                for (int j = 1; j <= n; j++) {
                    col[i + 1] = j;
                    queens(i + 1);
                }
            }
        }
    }

    static boolean promising(int i) {
        int k = 1;
        boolean isPromising = true;

        while (k < i && isPromising) {
            if (col[i] == col[k] || Math.abs(col[i] - col[k]) == (i - k)) {
                isPromising = false;
            }
            k++;
        }
        return isPromising;
    }

    static void printSolution() {
        for (int i = 1; i <= n; i++) {
            System.out.print(col[i] + " ");
        }
        System.out.println();
    }
}