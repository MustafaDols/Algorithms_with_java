package DynamicProgramming;

public class TheBinomialCoefficient {
    public static void main(String[] args) {
        System.out.println(bin(5,2));
        System.out.println(bin1(5,2));
        System.out.println(bin2(5,2));
    }
    //DivedAndConquer
    public static int bin (int n, int k)
    {
        if (k ==0 || n == k) return 1;
        else return bin (n - 1, k -1 ) + bin (n - 1, k );
    }

    //DynamicProgramming
    public static int bin2(int n, int k) {
        int[][] B = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    B[i][j] = 1;
                } else {
                    B[i][j] = B[i - 1][j - 1] + B[i - 1][j];
                }
            }
        }
        return B[n][k];
    }

    public static int bin1(int n, int k) {
        int[] dp = new int[k + 1];
        dp[0]=1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k);j>=1; j--) {
                dp[j]+=dp[j-1];
                }
            }
        return dp[k];
        }

    }



