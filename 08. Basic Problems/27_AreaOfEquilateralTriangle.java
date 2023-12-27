import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of the equilateral triangle: ");
        double a = sc.nextDouble();
        
        double area = (1.73 * a * a) / 4; 
        
        System.out.println("Area of Equilateral Triangle = " + area);
        
        sc.close();
    }
}
