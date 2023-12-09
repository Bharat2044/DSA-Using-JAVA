/*
  n = 5
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/



import java.util.Scanner;

public class Pattern60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
      	//upper part
        for(int i=1; i<=n; i++) {
          	for(int j=1; j<i; j++)
          	    System.out.print("  ");
          	    
      	    for(int k=1; k<=2*n-2*i+1; k++)
      	        System.out.print("* "); 
      	        
      	    System.out.println();
        }
        
        //lower part
        for(int i=n; i>=1; i--) {
          	for(int j=1; j<i; j++)
          	    System.out.print("  ");
          	    
      	    for(int k=1; k<=2*n-2*i+1; k++)
      	        System.out.print("* "); 
      	        
      	    System.out.println();
        }
    }
}
