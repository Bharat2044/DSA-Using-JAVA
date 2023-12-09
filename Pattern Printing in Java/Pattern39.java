/*
n = 4 
*
* 1 *
* 1 2 1 *
* 1 2 3 2 1 *
* 1 2 1 *
* 1 *
*

*/



import java.util.Scanner;

public class Pattern39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(j == 1)
                    System.out.print("* ");
                else
                    System.out.print((j-1) + " ");
            }
            
            for(int k=2; k<=i; k++) {
                if(k == i)
                    System.out.print("* ");
                else
                    System.out.print((i-k) + " ");
            }
                
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(j == 1)
                    System.out.print("* ");
                else
                    System.out.print((j-1) + " ");
            }
            
            for(int k=2; k<=i; k++) {
                if(k == i)
                    System.out.print("* ");
                else
                    System.out.print((i-k) + " ");
            }
                
            System.out.println();
        }
    }
}
