public class Billing {

    public static void computeBill(double amount) {
        showTotal(amount * 1.08); 
    }

    public static void computeBill(double amount, int count) {
        showTotal(amount * count * 1.08); 
    }

    public static void computeBill(double amount, int count, int reduction) {
        double adjustedAmount = amount - (amount * reduction / 100); 
        showTotal(adjustedAmount * count * 1.08); 
    }

    private static void showTotal(double finalCost) {
        System.out.printf("The total price for the bill is: $%.3f%n", finalCost);
    }

    public static void main(String[] args) {
        computeBill(23.2); 
        computeBill(24.2, 2); 
        computeBill(37.2, 2, 5); 
    }
}
