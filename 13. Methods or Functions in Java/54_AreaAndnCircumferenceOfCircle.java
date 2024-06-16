// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.


public class AreaAndCircumferenceOfCircle { 

    // Method to calculate the area of a circle given the radius
    public static double area(int r) {
        return (Math.PI * r * r); // Area formula: πr^2
    }

    // Method to calculate the circumference of a circle given the radius
    public static double circumference(int r) {
        return (2 * Math.PI * r); // Circumference formula: 2πr
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input

        System.out.print("Enter radius of the Circle: "); // Prompting the user to enter the radius
        int r = sc.nextInt(); // Reading the integer input for radius

        // Printing the area of the circle by calling the area method
        System.out.println("Area of Circle = " + area(r));
        
        // Printing the circumference of the circle by calling the circumference method
        System.out.println("Circumference of Circle = " + circumference(r));
        
        sc.close(); // Closing the Scanner object to prevent resource leaks
    }
}
