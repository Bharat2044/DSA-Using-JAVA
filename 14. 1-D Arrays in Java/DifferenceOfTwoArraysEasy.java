/*
i/p: 
n = 3
arr1 = 5 6 2
arr2 = 1 3 4
o/p:  4 3 -2

arr1 - arr2  &&  n1 == n2

------------------
  | 5 | 6 | 2
- | 1 | 3 | 4
------------------
    4   3   -2
*/


import java.util.Scanner;

public class DifferenceOfTwoArraysEasy {
  
    // TC = O(n), SC = O(n)
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = arr1.length;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        
        // taking array1 inputs
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        // taking array2 inputs
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int[] result = difference(arr1, arr2);
        
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}
