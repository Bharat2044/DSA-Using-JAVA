import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char oper = sc.next().charAt(0);
        
        System.out.println("Enter two numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();

        switch(oper) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;            
            default:
                System.out.println("Error! You entered a wrong operator, please enter a correct operator");
                break;
        }
    }
}