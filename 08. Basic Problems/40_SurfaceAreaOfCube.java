import java.util.Scanner;

public class SurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double a = sc.nextDouble();
        
        double surfaceArea = 6 * a * a;
        
        System.out.println("Surface Area of Cube = " + surfaceArea);
        
        sc.close();
    }
}
