// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.


import java.util.Scanner;

public class AreaAndnCircumferenceOfCircle {
  
    public static double area(int r) {
        
        return (Math.PI * r * r);
    }
  
    public static double circumference(int r) {
        
        return (2* Math.PI * r);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the Circle: ");
        int r = sc.nextInt();
        
        System.out.println("Area of Circle = " + area(r));
        System.out.println("nCircumference of Circle = " + circumference(r));
        
        sc.close();
    }
}
