import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter the base and side of parallelogram: ");
        double b = sc.nextDouble();
        double a = sc.nextDouble();

        double perimeter = 2 * (a * b);
        
        System.out.println("Perimeter Of Parallelogram = " + perimeter);
        
        sc.close();
    }
}
