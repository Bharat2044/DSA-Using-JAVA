import java.util.Scanner; // Import Scanner class for taking input

public class GCDandLCM {  // Class declaration
	public static void main(String[] args) { // Main method start
	    
	    Scanner sc = new Scanner(System.in); // Create Scanner object
      
        int a = sc.nextInt(); // Read first number
        int b = sc.nextInt(); // Read second number
        
        
        // ----------------------------------------------------
        // 1st Approach: Brute Force (Forward Traversal)
        // ----------------------------------------------------
        // TC = O(min(a, b)), SC = O(1)
        /*
        int gcd = 1; // Variable to store GCD
        int x = Math.min(a, b); // Find minimum of a and b
    
        for (int i = 2; i <= x; i++) { // Loop from 2 to min(a, b)
            if (a % i == 0 && b % i == 0) // If i divides both numbers
                gcd = i; // Update GCD
        }
          
        int lcm = (a * b) / gcd; // Calculate LCM using formula
        System.out.println("gcd = " + gcd); // Print GCD
        System.out.println("lcm = " + lcm); // Print LCM
        */
        
        
        // ----------------------------------------------------
        // 2nd Approach: Brute Force (Backward Traversal)
        // ----------------------------------------------------
        // TC = O(min(a, b)), SC = O(1)
        /*
        int gcd = 1; // Variable to store GCD
        int x = Math.min(a, b); // Find minimum value
	    
	    for (int i = x; i >= 1; i--) { // Traverse from min(a,b) to 1
	        if(a % i == 0 && b % i == 0) { // If i divides both numbers
	            gcd = i; // First such value is GCD
	            break; // Exit loop
	        }
	    }
          
        int lcm = (a * b) / gcd; // Calculate LCM
        System.out.println("gcd = " + gcd); // Print GCD
        System.out.println("lcm = " + lcm); // Print LCM
        */
    
    
        // ----------------------------------------------------
        // 3rd Approach: Optimized using sqrt(min(a, b))
        // ----------------------------------------------------
        // TC = O(sqrt(min(a, b))), SC = O(1)
        /*
        int gcd = 1; // Store GCD
        int x = Math.min(a, b); // Minimum of a and b
    
        for (int i = 1; i * i <= x; i++) { // Loop till sqrt(x)
            if (a % i == 0 && b % i == 0) // If i is common divisor
                gcd = i; // Update GCD
    
            if (a % (x / i) == 0 && b % (x / i) == 0) { // Check paired divisor
                gcd = x / i; // Update GCD with larger divisor
                break; // Exit loop
            }
        }
          
        int lcm = (a * b) / gcd; // Calculate LCM
        System.out.println("gcd = " + gcd); // Print GCD
        System.out.println("lcm = " + lcm); // Print LCM
        */
        
        
        // ----------------------------------------------------
        // 4th Approach: Euclidean Algorithm (Best Approach)
        // ----------------------------------------------------
        // TC = O(log(min(a, b))), SC = O(1)
        
        int x = a, y = b; // Copy values of a and b
    
        while (x % y != 0) { // Repeat until remainder becomes 0
            int r = x % y; // Compute remainder
            x = y; // Move y to x
            y = r; // Move remainder to y
        }

        int gcd = y; // Final value of y is GCD
        int lcm = (a * b) / gcd; // Calculate LCM using formula
        
        System.out.println("gcd = " + gcd); // Print GCD
        System.out.println("lcm = " + lcm); // Print LCM
        
        
        sc.close(); // Close Scanner
	}
}
