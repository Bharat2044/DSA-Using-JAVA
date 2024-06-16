// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.


import java.util.Scanner;

public class EligibleForVote { // Defining the main class

    // Method to check if a person is eligible to vote based on their age
    // TC = O(1), SC = O(1)
    public static boolean isEligible(int age) {
        // Returns true if age is 18 or more, false otherwise
        return (age >= 18); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input

        System.out.print("Enter your age: "); // Prompting the user to enter their age
        int age = sc.nextInt(); // Reading the integer input for age

        // Checking if the person is eligible to vote by calling the isEligible method
        if(isEligible(age)) {
            System.out.println("You are eligible to vote."); // Message for eligible voter
        } else {
            System.out.println("You are not eligible to vote."); // Message for non-eligible voter
        }
        
        sc.close(); // Closing the Scanner object to prevent resource leaks
    }
}
