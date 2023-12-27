import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;
        
        System.out.println("Perimeter Of Square = " + perimeter);
        
        sc.close();
    }
}
