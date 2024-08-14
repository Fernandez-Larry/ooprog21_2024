public class TrianglePattern {
    public static void main(String[] args) {
        int l, k, f;
        int n = 8;

        for (l = 1; l <= n; l++) { 
            for (f = n - l; f > 0; f--) { 
                System.out.print(" ");
            }

            for (k = 1; k <= l; k++) { 
                System.out.print("* ");
            }

            System.out.println(); 
        }
    }
}
