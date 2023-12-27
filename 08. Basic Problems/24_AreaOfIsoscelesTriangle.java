import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height of the isosceles triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        
        double area = 0.5 * b * h; 
        
        System.out.println("Area of Isosceles Triangle = " + area);
        
        sc.close();
    }
}
