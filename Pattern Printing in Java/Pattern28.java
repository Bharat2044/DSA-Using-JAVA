/*
 n = 5
1 2 3 4 5
2     5
3   5
4 5
5
*/


import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                if(i==1 || j==1 || j==n-i+1)
                    System.out.print((i+j-1) + " ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
