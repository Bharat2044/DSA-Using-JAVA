/*
n = 5
        *
      * * *
    *   *   * 
  *     *     * 
* * * * * * * * *
  *     *     * 
    *   *   * 
      * * *
        *
*/



import java.util.Scanner;

public class Pattern45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //upper part
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=n-i; s++)
                System.out.print("  ");
            
            for(int j=1; j<=2*i-1; j++) {
                if(i==n || j==1 || i==j || j==2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
        
        //lower part
        for(int i=n-1; i>=1; i--) {
            for(int s=1; s<=n-i; s++)
                System.out.print("  ");
            
            for(int j=1; j<=2*i-1; j++) {
                if(i==n || j==1 || i==j || j==2*i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
