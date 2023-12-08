/*
    n = 5
        *
      * *
    * * *
  * * * *
* * * * *
*/



import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            // for space
            for(int s=1; s<=n-i; s++)
                System.out.print("  ");
                
            // for star
            for(int j=1; j<=i; j++)
                System.out.print("* ");
            
            System.out.println();
        }
    }
}
