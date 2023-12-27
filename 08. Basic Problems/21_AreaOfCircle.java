import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        float r = sc.nextInt();
        
        float area = 3.141592f * r * r;
        
        System.out.println("Area of Circle = " + area);
        
        sc.close();
    }
}
