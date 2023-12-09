/*
m = 3, n = 4
3 
4 4 
5 5 5
6 6 6 6 
5 5 5 
4 4 
3
*/



import java.util.Scanner;

public class Pattern36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for(int i=m; i<=m+n-1; i++) {
            for(int j=m; j<=i; j++)
                System.out.print(i + " ");
                
            System.out.println();
        }
        
        for(int i=m+n-2; i>=1; i--) {
            for(int j=m; j<=i; j++)
                System.out.print(i + " ");
                
            System.out.println();
        }
    }
}
