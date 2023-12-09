/*   
n = 5
0 0 0 0 5 0  0  0  0
0 0 0 4 8 12 0  0  0
0 0 3 6 9 12 15 0  0
0 2 4 6 8 10 12 14 0
1 2 3 4 5 6  7  8  9
*/



import java.util.Scanner;

public class Pattern61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
        for(int i=1; i<=n; i++) {
            for(int z=1; z<=n-i; z++) 
                System.out.print("0 "); 
        
            for(int j=1; j<=2*i-1; j++)
                System.out.print(((n-i+1)*j) + " "); 
            
            for(int z=1; z<=n-i; z++) 
                System.out.print("0 "); 
      	        
      	    System.out.println();
        }
    }
}
