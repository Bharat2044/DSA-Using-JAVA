import java.util.Scanner;

public class SimpleCalculator { 

    /*
     * Method to calculate the sum of two numbers
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float sum(float a, float b) {
        // Return the sum of a and b
        return a + b;
    }
    
    /*
     * Method to calculate the difference of two numbers
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float difference(float a, float b) {
        // Return the difference of a and b
        return a - b;
    }
    
    /*
     * Method to calculate the product of two numbers
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float multiplication(float a, float b) {
        // Return the product of a and b
        return a * b;
    }
    
    /*
     * Method to calculate the division of two numbers
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float division(float a, float b) {
        // Return the division of a by b
        return a / b;
    }
    
    /*
     * Method to calculate the remainder of two numbers
     * Time Complexity: O(1) as it performs a constant number of operations
     * Space Complexity: O(1) as it uses a constant amount of extra space
     */
    public static float remainder(float a, float b) {
        // Return the remainder of a divided by b
        return a % b;
    }
   
    public static void main(String[] args) {   
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter an operator
        System.out.print("Enter an operator (+, -, *, /, %) ->  ");
        char oper = sc.next().charAt(0);
        
        // Prompt the user to enter the first number
        System.out.println("Enter first number: ");
        float num1 = sc.nextFloat();        
        
        // Prompt the user to enter the second number
        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();

        // Perform the operation based on the user input
        switch(oper) {            
            case '+' -> {
                // Calculate the sum
                float ans = sum(num1, num2);
                // Print the result
                System.out.println(num1 + " + " + num2 + " = " + ans);
            }
                
            case '-' -> {
                // Calculate the difference
                float ans = difference(num1, num2);
                // Print the result
                System.out.println(num1 + " - " + num2 + " = " + ans);
            }
                
            case '*' -> {
                // Calculate the product
                float ans = multiplication(num1, num2);
                // Print the result
                System.out.println(num1 + " * " + num2 + " = " + ans);
            }
                
            case '/' -> {
                // Calculate the division
                float ans = division(num1, num2);
                // Print the result
                System.out.println(num1 + " / " + num2 + " = " + ans);
            }
                
            case '%' -> {
                // Calculate the remainder
                float ans = remainder(num1, num2);
                // Print the result
                System.out.println(num1 + " % " + num2 + " = " + ans);
            }
                            
            default -> {
                // Print an error message if the operator is invalid
                System.out.println("Error! You entered a wrong operator, please enter a correct operator");
            }
        }
        
        // Close the scanner
        sc.close();
    }
}
