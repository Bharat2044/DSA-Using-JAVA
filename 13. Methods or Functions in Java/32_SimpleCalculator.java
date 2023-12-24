import java.util.Scanner;

public class SimpleCalculator { 

    public static float sum(float a, float b) {
        return a + b;
    }
    
    public static float difference(float a, float b) {
        return a - b;
    }
    
    public static float multiplication(float a, float b) {
        return a * b;
    }
    
    public static float division(float a, float b) {
        return a / b;
    }
    
    public static float remainder(float a, float b) {
        return a % b;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an operator (+, -, *, /, %) ->  ");
        char oper = sc.next().charAt(0);
        
        System.out.println("Enter first number: ");
        float num1 = sc.nextFloat();        
        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();

        switch(oper) {            
            case '+' -> {
                float ans = sum(num1,num2);
                System.out.println(num1 + " + " + num2 + " = " + ans);
            }
                
            case '-' -> {
                float ans = difference(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + ans);
            }
                
            case '*' -> {
                float ans = multiplication(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + ans);
            }
                
            case '/' -> {
                float ans = division(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + ans);
            }
                
            case '%' -> {
                float ans = remainder(num1, num2);
                System.out.println(num1 + " % " + num2 + " = " + ans);
            }
                            
            default -> System.out.println("Error! You entered a wrong operator, please enter a correct operator");                
        }
    }
}