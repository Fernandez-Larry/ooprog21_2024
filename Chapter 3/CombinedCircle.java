public class CombinedCircle {
    
    private static double radius;
    private static double diameter;
    private static double area;

    
    public CombinedCircle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

   
    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {
        
        CombinedCircle a = new CombinedCircle();
        CombinedCircle b = new CombinedCircle();
        CombinedCircle c = new CombinedCircle();

        
        a.setRadius(3);
        System.out.println("Radius of the first circle: " + a.getRadius());
        System.out.println("Diameter of the first circle: " + a.getDiameter());
        System.out.println("Area of the first circle: " + a.getArea());

        
        b.setRadius(20);
        System.out.println("Radius of the second circle: " + b.getRadius());
        System.out.println("Diameter of the second circle: " + b.getDiameter());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}