import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and weight of the rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        
        double area = l * w; 
        
        System.out.println("Area of Rectangle = " + area);
        
        sc.close();
    }
}
