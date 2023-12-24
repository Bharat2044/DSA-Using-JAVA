import java.util.Scanner;

public class DecimalToBinary { 

    public static float areaOfSquare(float a) {
        
        return (a * a);
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter side of area: ");
          float a = sc.nextFloat(); 
          
          float ans = areaOfSquare(a);
            
          System.out.println("Area = " + ans);
    }
}