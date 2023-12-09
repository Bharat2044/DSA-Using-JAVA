/*
n = 5
    * * * * * 
   *       * 
  *       * 
 *       * 
* * * * *
    
*/



import java.util.Scanner;

public class Pattern49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i;s++)
                System.out.print(" ");
                
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
