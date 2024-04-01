/*
i/p: 
n1 = 4
arr1 = 4 5 6 2
n2 = 3
arr2 = 9 3 4
o/p: 4 -4 3 -2

arr1 - arr2  &&  n1 != n2

------------------
  4 | 5 | 6 | 2
-   | 9 | 3 | 4
------------------
  4  -4   3  -2
*/


import java.util.Scanner;

public class DifferenceOfTwoArraysEasy {
  
    // Approach - 1: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    /*
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = Math.max(arr1.length, arr2.length);
        int[] result = new int[n];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        
        while(i >= 0 && j >= 0) {
            
            result[k] = arr1[i] - arr2[j];
            
            i--;
            j--;
            k--;
        }
        
        while(i >= 0) {
            result[k] = arr1[i];
            i--;
            k--;
        }
        
        while(j >= 0) {
            result[k] = arr2[j];
            j--;
            k--;
        }
        
        return result;
    }
    */
    
    
    // Approach - 2: TC = O(max(n1, n2)), SC = O(max(n1, n2))
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = Math.max(arr1.length, arr2.length);
        int[] result = new int[n];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        
        while(k >= 0) {
            if(i >= 0) {
                result[k] = arr1[i];
            }
            
            if(j >= 0) {
                result[k] -= arr2[j];
            }
            
            i--;
            j--;
            k--;
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        
        // taking array1 inputs
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
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
