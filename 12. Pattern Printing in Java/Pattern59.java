/*
 width = 3, height = 4
        * 
       * * 
      * * * 
      * * * 
     * * * * 
    * * * * * 
    * * * * * 
   * * * * * * 
  * * * * * * * 
  * * * * * * * 
 * * * * * * * * 
* * * * * * * * * 
      * * * 
      * * * 
      * * * 
*/



import java.util.Scanner;

public class Pattern59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      	System.out.println("Enter Christmas Tree Width & Height: ");
      	int width = sc.nextInt();
      	int height = sc.nextInt();
      	
      	int n = 1;
      	int space = width * height;
      
      	for (int x=1; x<=height; x++) {
        		for (int i=n; i<=width; i++) {
          			for (int j=space; j>=i; j--) 
          				  System.out.print(" ");
          			for (int k=1; k<=i; k++)
          				  System.out.print("* ");
          				  
        			  System.out.println();
        		}
        		
        		n = n + 2;
        		width = width + 2;
        }
        	
        for (int i=1; i <=height-1; i++) {
        		for (int j=space-3; j>=0; j--)
        			System.out.print(" ");
        		for (int k=1; k<= height-1; k++)
        			System.out.print("* ");
        		
        		System.out.println();
        }
    }
}
