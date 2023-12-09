/*
    n = 5
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/



import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            //for space 
            for(int s=1; s<=n-i; s++)
                System.out.print("  ");
                
            //left part
            for(int j=1; j<=i; j++)
                System.out.print(j + " ");
            
            //right part
            for(int k=2; k<=i;k++)
                System.out.print((i-k+1) + " ");
                
            System.out.println();
        }
    }
}
