/*
n = 5
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1  
*/



import java.util.Scanner;

public class Pattern41 {
  
    public static int factorial(int n) {
        int fact = 1;
        
        for(int i=1; i<=n; i++)
            fact *= i;
            
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        
        // 1st Approach => TC = O(n^3), SC = O(1)
        for(int i=0; i<n; i++) {
            for(int s=1; s<=n-i; s++)
                System.out.print(" ");
            
            for(int j=0; j<=i; j++)
                System.out.print((factorial(i) / (factorial(j)*factorial(i-j))) + " ");
        
            System.out.println();
        }
        
        
        /*
        // 2nd Approach => TC = O(n^2), SC = O(1)
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i; s++)
                System.out.print(" ");
                
            int x = 1;
            for(int j=1; j<=i; j++) {
                System.out.print(x + " ");
                x = x*(i-j)/j;
            }
            
            System.out.println();
        }
        */
    }
}
