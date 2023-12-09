/*
n = 4 
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1
*/



import java.util.Scanner;

public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*i-1; j++) {
                if(j%2 == 1)
                    System.out.print(i + " ");
                else
                    System.out.print("* ");
            }
                
            System.out.println();
        }
        
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=2*i-1; j++) {
                if(j%2 == 1)
                    System.out.print(i + " ");
                else
                    System.out.print("* ");
            }
                
            System.out.println();
        }
    }
}
