/*
    n = 5
* * * * *
  *     * 
    *   * 
      * * 
        *  
*/ 



import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int s=1; s<=i-1; s++)
                System.out.print("  ");
                
            for(int j=1; j<=n-i+1; j++) {
                if((i==1) || (j==1) || (j==n-i+1))
                    System.out.print("* ");
                else  
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
