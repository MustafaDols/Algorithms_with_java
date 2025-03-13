package Greedy;
import java.util.LinkedHashMap;
import java.util.Map;
public class JoesChangeProblem {

    public static void main(String[] args) {
        int amountOwed = 36; // المبلغ المطلوب بالـ "سنت"
        System.out.println("Amount owed: " + amountOwed + " cents");
        calculateChange(amountOwed);
    }

    public static void calculateChange(int amount) {
        // تعريف العملات المتاحة (القيمة بالسنت) باستخدام LinkedHashMap للحفاظ على الترتيب
        Map<String, Integer> coins = new LinkedHashMap<>();
        coins.put("Quarter (25¢)", 25);
        coins.put("Dime (10¢)", 10);
        coins.put("Nickel (5¢)", 5);
        coins.put("Penny (1¢)", 1);

        System.out.println("Steps to calculate the change:");

        // تتبع المبلغ المتبقي
        int remainingAmount = amount;

        // المرور على العملات واختيار أكبر عملة ممكنة في كل خطوة
        for (Map.Entry<String, Integer> coin : coins.entrySet()) {
            String coinName = coin.getKey();
            int coinValue = coin.getValue();

            // حساب عدد العملات من كل فئة
            int count = remainingAmount / coinValue;

            if (count > 0) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Grab " + coinName);
                }
                // تحديث المبلغ المتبقي
                remainingAmount %= coinValue;
            }
        }

        System.out.println("Total change given.");
    }
}
