/*
 n = 5
1 2 3 4 5
1     4
1   3 
1 2
1
*/


import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                if(i==1 || j==1 || j==n-i+1)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
