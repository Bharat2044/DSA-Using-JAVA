/*
    n = 5
    *
    * *
    *   *
    *     *
    * * * * *
*/


import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i==n) || (j==1) || (i==j))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
