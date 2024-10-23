import java.util.Scanner;

public class UniqueSortNumbers {
    public static void main(String[] args) {
        Scanner numberInputScanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstInputNumber = numberInputScanner.nextInt();
        
        System.out.println("Enter the second number:");
        int secondInputNumber = numberInputScanner.nextInt();
        
        System.out.println("Enter the third number:");
        int thirdInputNumber = numberInputScanner.nextInt();

        int largestNumber, middleNumber, smallestNumber;

        if (firstInputNumber >= secondInputNumber && firstInputNumber >= thirdInputNumber) {
            largestNumber = firstInputNumber;
        } else if (secondInputNumber >= firstInputNumber && secondInputNumber >= thirdInputNumber) {
            largestNumber = secondInputNumber;
        } else {
            largestNumber = thirdInputNumber;
        }

        if (firstInputNumber <= secondInputNumber && firstInputNumber <= thirdInputNumber) {
            smallestNumber = firstInputNumber;
        } else if (secondInputNumber <= firstInputNumber && secondInputNumber <= thirdInputNumber) {
            smallestNumber = secondInputNumber;
        } else {
            smallestNumber = thirdInputNumber;
        }

        middleNumber = (firstInputNumber + secondInputNumber + thirdInputNumber) - (largestNumber + smallestNumber);

        if (firstInputNumber <= secondInputNumber && secondInputNumber <= thirdInputNumber) {
            System.out.println("Numbers in descending order: " + largestNumber + " " + middleNumber + " " + smallestNumber);
        } else {
            System.out.println("Numbers in ascending order: " + smallestNumber + " " + middleNumber + " " + largestNumber);
        }
    }
}
