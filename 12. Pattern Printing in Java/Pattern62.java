/*
    n = 5
    *****
      *  
     *   
    *    
    *****
*/


import java.util.Scanner;

public class Pattern62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == (n-i)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
