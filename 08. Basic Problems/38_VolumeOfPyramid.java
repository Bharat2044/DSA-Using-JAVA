import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length, width and height of the sphere: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        
        double b = l * w;
        
        double volume = (b * h) / 3;
        
        System.out.println("Volume Of Pyramid = " + volume);
        
        sc.close();
    }
}
