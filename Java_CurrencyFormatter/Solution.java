import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        // double payment = 12324.134;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String formatted = String.format(Locale.US, "%,.2f", payment);

        String us = "$" + formatted;
        String india = "Rs." + formatted;
        String china = "￥" + formatted;

        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}