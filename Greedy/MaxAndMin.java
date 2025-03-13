package Greedy;
import java.util.Arrays;
class MaxSubsetSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 10, 7};
        System.out.println("Maximum subset sum: " + maxSubsetSum(nums));
    }
    public static int maxSubsetSum(int[] nums) {
        int include = nums[0];
        int exclude = 0;
        for (int i = 1; i < nums.length; i++) {
            int newExclude = Math.max(include, exclude);
            include = exclude + nums[i];
            exclude = newExclude;
        }

        return Math.max(include, exclude);
    }
}

public class MaxAndMin {
    public static int minCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }
}