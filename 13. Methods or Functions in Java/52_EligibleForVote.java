// A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.


import java.util.Scanner;

public class EligibleForVote {
  
    public static boolean isEligible(int age) {
        
        return (age >= 18);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if(isEligible(age)) {
            System.out.println("You are eligible for vote.");
        }
        else {
            System.out.println("You are not eligible for vote.");
        }
        
        sc.close();
    }
}
