/*
i/p: n = 5
arr = 2 3 1 4 5
o/p:
        * 
      * *
  *   * *
* *   * *
* * * * *

*/


import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // finding maximum height
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        
        // printing shape
        for(int ht = max; ht >= 1; ht--) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= ht)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
