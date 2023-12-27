// ake integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int maxi = Integer.MIN_VALUE;

        do {
            System.out.print("Enter an integer (enter 0 to finish): ");
            n = sc.nextInt();
            
            if(n > maxi) {
                maxi = n;
            }
        } while(n != 0);

        System.out.println("Largest Number = " + maxi);
        
        sc.close();
    }
}
