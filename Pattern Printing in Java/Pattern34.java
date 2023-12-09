/*
    n = 5
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****

*/



import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
           for(int s=1; s<=2*n-i-1; s++)
                System.out.print("*");
                
            for(int j=1; j<=i; j++)
                System.out.print(i + "*");
            
            for(int k=1; k<=2*n-i-2;k++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}
