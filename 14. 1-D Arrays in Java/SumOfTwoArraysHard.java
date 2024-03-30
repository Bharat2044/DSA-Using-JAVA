/*
i/p: 
n1 = 3
arr1 = 4 9 7
n2 = 5
arr2 = 9 4 6 3 2
o/p: 9 5 1 2 9

n1 != n2   &&   arr1 + arr2

-----------------------
            4 | 9 | 7
- | 9 | 4 | 6 | 3 | 2
-----------------------
    9   5   1   2   9
*/


import java.util.Scanner;

public class SumOfTwoArraysHard {
    
    // TC = O(max(n1, n2)), SC = O(max(n1, n2))
    public static int[] sum(int[] one, int[] two) {
      
        int n = Math.max(one.length, two.length);
        int[] ans = new int[n];
        
        int i = one.length - 1;
        int j = two.length - 1;
        int k = ans.length - 1;
        
        int c = 0; // carry
        while(k >= 0) {
            int d = c;
            
            if(i >= 0) {
                d = d + one[i];
            }
            
            if(j >= 0) {
                d = d + two[j];
            }
            
            c = d / 10;
            d = d % 10;
            
            ans[k] = d;
            
            i--;
            j--;
            k--;
        }
        
        if(c > 0)
            ans[0] += c * 10;
        
        return ans;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] one = new int[n1];
        
        // taking array1 inputs
        for(int i = 0; i < one.length; i++) {
            one[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt();
        int[] two = new int[n2];
        
        // taking array2 inputs
        for(int i = 0; i < two.length; i++) {
            two[i] = sc.nextInt();
        }
        
        int[] result = sum(one, two);
        
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}
