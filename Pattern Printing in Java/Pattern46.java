/*
n = 3
    *
      *
* * * * *
      *
    *
    
*/



import java.util.Scanner;

public class Pattern46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n+i-1; j++) {
                if(i==n || j==n+i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
        
        for(int i=n-1; i>=1; i--) {
            for(int j=1; j<=n+i-1; j++) {
                if(i==n || j==n+i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
