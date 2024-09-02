import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        final int PRICE_PER_HOUR = 40;
        final int PRICE_PER_ADDITIONAL_MINUTE = 1;
        Scanner input = new Scanner(System.in);

        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        
        System.out.print("Enter the number of minutes: ");
        int totalMinutes = input.nextInt();

        
        int hours = totalMinutes / 60;
        int additionalMinutes = totalMinutes % 60;
        
        
        int totalPrice = (hours * PRICE_PER_HOUR) + (additionalMinutes * PRICE_PER_ADDITIONAL_MINUTE);

        
        System.out.println("Hours: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total price: $" + totalPrice);
        
        input.close();
    }
}
