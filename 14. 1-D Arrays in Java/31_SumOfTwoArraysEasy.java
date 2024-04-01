/*
i/p: 
n = 3
arr1 = 5 6 2
arr2 = 1 4 7
o/p:  6 10 9

------------------
  | 5 | 6 | 2
+ | 1 | 4 | 7
------------------
    4  10   9
*/


import java.util.Scanner;

public class SumOfTwoArraysEasy {
  
    // TC = O(n), SC = O(n)
    public static int[] sum(int[] arr1, int[] arr2) {
      
        int n = arr1.length;
        int[] result = new int[n];
        
        for(int i = 0; i < n; i++) {
            result[i] = arr1[i] + arr2[i];
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
        
        int[] result = sum(arr1, arr2);
        
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}
