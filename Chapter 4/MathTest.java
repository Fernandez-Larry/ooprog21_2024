public class MathTest {
    public static void main(String[] args) {
        double number = 37;
        double sinInput = 3 * Math.PI / 2; 
        double cosInput = 3 * Math.PI; 
        double decimalNumber = 22.7;

        
        System.out.println("SQRT: " + Math.sqrt(37));

        
        System.out.println("SIN: " + Math.sin(sinInput));  
        System.out.println("COS: " + Math.cos(cosInput));  

        
        System.out.println("FLOOR: " + Math.floor(decimalNumber)); 
        System.out.println("CEIL: " + Math.ceil(decimalNumber));   

        
        System.out.println("ROUND: " + Math.round(decimalNumber)); 

       
        int num1 = 71, num2 = 68;
        System.out.println("MAX: " + Math.max(num1, num2)); 
        System.out.println("MIN: " + Math.min(num1, num2)); 

                double randomValue = 13.762159708531525;
        System.out.println("RANDOM: " + randomValue);      
        }
}
