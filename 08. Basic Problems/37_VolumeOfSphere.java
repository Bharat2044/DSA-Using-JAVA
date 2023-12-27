import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double r = sc.nextDouble();
        
        double volume = (4 * Math.PI * r * r * r) / 3;
        
        System.out.println("Volume Of Sphere = " + volume);
        
        sc.close();
    }
}
