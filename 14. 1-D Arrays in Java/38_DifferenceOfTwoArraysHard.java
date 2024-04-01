/*
i/p: 
n1 = 4
arr1 = 4 5 6 2
n2 = 3
arr2 = 9 3 4
o/p: 2 -4 3 -2

n1 != n2   &&   arr1 - arr2

------------------
  4 | 5 | 6 | 2
-   | 9 | 3 | 4
------------------
   3  6   2   8
*/


import java.util.Scanner;

public class DifferenceOfTwoArraysHard {
    
    // TC = O(max(n1, n2)), SC = O(max(n1, n2))
    public static int[] difference(int[] arr1, int[] arr2) {
      
        int n = Math.max(arr1.length, arr2.length);
        int[] result = new int[n];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        
        int borrow = 0;
        
        while(k >= 0) {
            int d = 0;
            
            if(i >= 0) {
                d = arr1[i] - borrow;
            }
            
            if(j >= 0) {
                d = d - arr2[j];
                
                if(arr2.length > arr1.length) {
                    d = d - borrow;
                }
            }
            
            if(d < 0) {
                borrow = 1;
                d = d + 10;
            } else {
                borrow = 0;
            }
            
            result[k] = d;
            
            i--;
            j--;
            k--;
        }
        
        // Handling 1st digit
        if((arr2.length > arr1.length) || ((arr1.length == arr2.length) && (arr1[0] <= arr2[0]))) {
            result[0] = -result[0];
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
        
        // Don't print leading zeroes
        int idx = 0;
        while(idx <= result.length) {
            if(result[idx] != 0) {
                break;
            } else {
                idx++;
            }
        }
        
        for(int i = idx; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}
