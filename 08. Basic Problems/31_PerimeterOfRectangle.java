import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        double perimeter = 2 * (l + w);
        
        System.out.println("Perimeter Of Rectangle = " + perimeter);
        
        sc.close();
    }
}
