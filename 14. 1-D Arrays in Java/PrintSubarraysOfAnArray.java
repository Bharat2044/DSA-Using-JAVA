/*
i/p: 
n = 3
arr = 10 20 30
o/p: 
10	
10  20	
10	20	30	
20	
20	30	
30	
*/


import java.util.Scanner;

public class PrintSubarraysOfAnArray {
    // TC = O(n^3), SC = O(1)
    public static void printSubarrays(int[] arr) {
      
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
              
              for(int k = i; k <= j; k++) {
                  System.out.print(arr[k] + "  ");
              }
              
              System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        printSubarrays(arr);
        
        sc.close();
    }
}
