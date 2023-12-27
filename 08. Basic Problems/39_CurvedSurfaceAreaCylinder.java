import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height of the cylinder: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        
        double curvedSurfaceArea = 2 * Math.PI * r * h;
        
        System.out.println("Curved surface area of Cylinder = " + curvedSurfaceArea);
        
        sc.close();
    }
}
