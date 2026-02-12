/*
Input:
n = 3
Output:
     *
    ***
   *****
***********
 *********
  *******
  *******
 *********
***********
   *****
    ***
     *

Input:
n = 5
Output:
         *
        ***
       *****
      *******
     *********
*******************
 *****************
  ***************
   *************
    ***********
    ***********
   *************
  ***************
 *****************
*******************
     *********
      *******
       *****
        ***
         *
*/



import java.util.Scanner;

public class Pattern65 {
    
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		// Scan the value of n 
		int n = sc.nextInt();
		
		// first pyramid
		for (int i = 1; i <= n; i++) {
		    
		    // square of spaces
		    for (int s = 1; s <= n; s++) {
		        System.out.print(" ");
		    }
		    
		    // Spaces infort of the triange
		    for (int s = 1; s <= n - i; s++) {
		        System.out.print(" ");
		    }
		    
		    // Stars of the pyramid
		    for (int j = 1; j <= (2 * i - 1); j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
		// The first trapazium
		for (int i = 1; i <= n; i++) {
		    
		    // Spaces of the triangle
		    for (int s = 1; s <= (i - 1); s++) {
		        System.out.print(" ");
		    }
		    
		    // Stars of the triangle
		    for (int j = 1; j <= (n - i + 1); j++) {
		        System.out.print("*");
		    }
		    
		    // Stars of the rectangle
		    for (int j = 1; j <= (2 * n - 1); j++) {
		        System.out.print("*");
		    }
		    
		    // Stars of the triangle
		    for (int j = 1; j <= (n - i + 1); j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
		
		// The second trapazium
		for (int i = n; i >= 1; i--) {
		    
		    // Spaces of the triangle
		    for (int s = 1; s <= (i - 1); s++) {
		        System.out.print(" ");
		    }
		    
		    // Stars of the triangle
		    for (int j = 1; j <= (n - i + 1); j++) {
		        System.out.print("*");
		    }
		    
		    // Stars of the rectangle
		    for (int j = 1; j <= (2 * n - 1); j++) {
		        System.out.print("*");
		    }
		    
		    // Stars of the triangle
		    for (int j = 1; j <= (n - i + 1); j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
		// second pyramid
		for (int i = n; i >= 1; i--) {
		    
		    // square of spaces
		    for (int s = 1; s <= n; s++) {
		        System.out.print(" ");
		    }
		    
		    // Spaces infort of the triange
		    for (int s = 1; s <= n - i; s++) {
		        System.out.print(" ");
		    }
		    
		    // Stars of the pyramid
		    for (int j = 1; j <= (2 * i - 1); j++) {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
	}
}
