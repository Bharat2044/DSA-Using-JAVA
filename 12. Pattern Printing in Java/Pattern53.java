/*
n = 5
    A
   A B
  A   C
 A     D
A B C D E
*/



import java.util.Scanner;

public class Pattern53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(char s=1; s<=n-i; s++) 
                System.out.print(" ");
            
            for(char j=1; j<=i; j++) {
                if(i==n || j==1 || j==i)
                    System.out.print((char)('A'+j-1) + " ");
                else
                    System.out.print("  ");
            }
                
            System.out.println();
        }
    }
}
