public class Warmup {
    public boolean sleepIn(boolean isWeekday, boolean isVacation) {
        boolean canSleepIn = !isWeekday || isVacation;
        return canSleepIn;
    }

    public static void main(String[] args) {
        Warmup warmup = new Warmup();
        
        System.out.println(warmup.sleepIn(false, false)); 
        System.out.println(warmup.sleepIn(true, false));  
        System.out.println(warmup.sleepIn(false, true));  
    }
}
