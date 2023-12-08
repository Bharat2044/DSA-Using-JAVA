/*
 n = 5
1
1 2
1   3
1     4
1 2 3 4 5
*/



import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i==n || j==1 || j==i)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
