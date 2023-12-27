import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height of the cylinder: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        
        double volume = Math.PI * r * r * h;
        
        System.out.println("Volume Of Cylinder = " + volume);
        
        sc.close();
    }
}
