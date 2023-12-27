import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius and height of the cone: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double volume = (Math.PI * r * r * h) / 3;
        
        System.out.println("Volume Of Cone = " + volume);
        
        sc.close();
    }
}
