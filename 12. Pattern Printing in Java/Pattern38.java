/*
n = 4 
1 
2 * 3 
4 * 5 * 6 
7 * 8 * 9 * 10
7 * 8 * 9 * 10 
4 * 5 * 6 
2 * 3 
1
*/



import java.util.Scanner;

public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*i-1; j++) {
                if(j%2 == 1)
                    System.out.print((count++) + " ");
                else
                    System.out.print("* ");
            }
                
            System.out.println();
        }
        
        for(int i=n; i>=1; i--) {
            count = count-i;
            int temp = count;
            
            for(int j=1; j<=2*i-1; j++) {
                if(j%2 == 1)
                    System.out.print((count++) + " ");
                else
                    System.out.print("* ");
            }
            count = temp;
                
            System.out.println();
        }
    }
}
