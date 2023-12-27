import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the rhombus: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;
        
        System.out.println("Perimeter Of Rhombus = " + perimeter);
        
        sc.close();
    }
}
