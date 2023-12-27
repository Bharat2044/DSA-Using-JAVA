import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height of the triangle: ");
        float b = sc.nextInt();
        float h = sc.nextInt();
        
        float area = 0.5f * b * h;  // A = (b * h) / 2
        
        System.out.println("Area of Triangle = " + area);
        
        sc.close();
    }
}
