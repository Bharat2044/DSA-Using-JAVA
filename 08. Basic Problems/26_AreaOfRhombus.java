import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        
        double area = 0.5 * d1 * d2; 
        
        System.out.println("Area of Rhombus = " + area);
        
        sc.close();
    }
}
