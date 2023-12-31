// ip: 1
// op: 2        => 2^1 = 2

// ip: 2
// op: 4        => 2^2 = 4

// ip: 3
// op: 8        => 2^3 = 8


import java.util.Scanner;

public class PrintPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      
        /*
        // Approach 1: Time Complexity: O(n), Space Complexity: O(1)
        int ans = 1;

        for (int i=1; i<=n; i++) {
            ans *= 2;
        }
        
        System.out.println("2^" + n + " = " + ans);
        */
        
        
        // Approach 2: Time Complexity: O(logn), Space Complexity: O(1)
        // System.out.println("2^" + n + " = " + ((int)(Math.pow(2, n))));
        
        
        // Approach 3: Time Complexity: O(n), Space Complexity: O(1)
        System.out.println("2^" + n + " = " + (1 << n));
    }
}