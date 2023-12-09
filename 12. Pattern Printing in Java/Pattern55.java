/*
n = 4
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/



import java.util.Scanner;

public class Pattern55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int k = 2*n-1;
        
        for(int i=1; i<=k; i++){
            for(int j=1; j<=k; j++) 
                System.out.print((Math.max(Math.abs(i-n), Math.abs(j-n))+1) + " ");
                
            System.out.println();
        }
    }
}
