/*
n = 4
1  2 3 4 
9  * * 12 
13 * * 16 
5  6 7 8 
 
n = 5
1  2 3 4 5 
11 * * * 15 
21 * * * 25 
16 * * * 20 
6  7 8 9 10 
*/
 
 
import java.util.Scanner;

public class Pattern63 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int k = 0;
        for(int i=1; i<=n; i++) {
            int stVal = n * k + 1;
                
            for(int j=1; j<=n; j++) {
             
                if(i == 1 || i == n || j == 1 || j == n)
                    System.out.print(stVal + " ");
                else 
                    System.out.print("* ");
                stVal++;
            }
            
            System.out.println();
            
            // for even
            if(n % 2 == 0) {
                if(i <= n/2-1)
                    k += 2;
                else if(i == (n / 2 ))
                    k += 1;
                else
                    k -= 2;
            }
            else {  // for odd
                if(i <= n/2)
                    k += 2;
                else if(i == (n / 2 + 1))
                    k -= 1;
                else
                    k -= 2;
            }
        }
    }
}
