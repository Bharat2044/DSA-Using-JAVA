import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length, width and height of the prism: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        
        double b = l * w;

        double volume = b * h;
        
        System.out.println("Volume Of Prism = " + volume);
        
        sc.close();
    }
}
