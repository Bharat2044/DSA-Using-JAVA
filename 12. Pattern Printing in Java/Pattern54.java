/*
 n = 5
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A
*/



import java.util.Scanner;

public class Pattern54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            // left part
            for(char j=1; j<=i; j++) 
                System.out.print((char)('A'+j-1) + " ");
            
            // right part
            for(int k=2; k<=i;k++)
                System.out.print((char)('A'+i-k) + " ");
                
            System.out.println();
        }
    }
}
