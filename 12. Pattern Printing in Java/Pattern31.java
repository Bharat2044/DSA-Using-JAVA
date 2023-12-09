/*
 n = 5
        1
      2 3 2 
    3 4 5 4 3 
  4 5 6 7 6 5 4 
5 6 7 8 9 8 7 6 5 
*/



import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            //left part
            for(int s=1; s<=n-i; s++)
                System.out.print("  ");
            for(int j=1; j<=i; j++)
                System.out.print((i+j-1) + " ");
            
            //right part
            int x = 2*i-2;
            for(int k=2; k<=i; k++)
                System.out.print((x--) + " ");
                
            System.out.println();
        }
    }
}
