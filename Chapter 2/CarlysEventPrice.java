import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        final int PRICE_PER_PERSON = 35;
        Scanner input = new Scanner(System.in);

        
        System.out.println("****************************************");
        System.out.println("* Carly's makes the food that makes     *");
        System.out.println("* it a party.                           *");
        System.out.println("****************************************");

        
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();

       
        int totalPrice = numberOfGuests * PRICE_PER_PERSON;

        
        boolean isLargeEvent = numberOfGuests >= 50;

        
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
        
        input.close();
    }
}
