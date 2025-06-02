/*
i/p:
n = 5
o/p:
    1 
  2 3 2 
3 4 5 4 3 
  2 3 2 
    1 

i/p:
n = 7
o/p:
      1 
    2 3 2 
  3 4 5 4 3 
4 5 6 7 6 5 4 
  3 4 5 4 3 
    2 3 2 
      1 
*/



import java.util.Scanner;

public class Pattern64 { 
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
      int n = sc.nextInt();
	    
	    int st = 1, sp = n / 2, val = 1;;
	    
	    for (int i = 1; i <= n; i++) {
	        
	        for (int s = 1; s <= sp; s++) {
	            System.out.print("  ");
	        }
	        
	        int x = val;
		    
	        for (int j = 1; j <= st; j++) {
	            System.out.print(x + " ");
	            
	            if (j <= st / 2) {
	                x++;
	            } else {
	                x--;
	            }
	        }
	        
	        if (i <= n / 2) {
	            st += 2;
	            val++;
	            sp--;
	        } else {
	            st -= 2;
	            val--;
	            sp++;
	        }
	        
	        System.out.println();
	    }
	}
}
