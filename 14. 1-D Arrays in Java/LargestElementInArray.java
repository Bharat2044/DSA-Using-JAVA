/*
i/p: 
n = 5
arr = 2 12 6 70 5
o/p: 70
*/


import java.util.Scanner;
import java.util.Arrays;

public class LargestElementInArray {
    /*
    // 1st Approach: Brute Force => TC = O(n^2) , SC = O(1)
    public static int getLargestElement(int[] arr) {
      
        for(int i = 0; i < arr.length; i++) {
            boolean flag = true;
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            
            if(flag == true)
                return arr[i];
        }
        
        return -1;
    }
    */
  
    /*
    // 2nd Approach: Using Sorting => TC = O(n * log(n)) , SC = O(1)
    public static int getLargestElement(int[] arr) {
        Arrays.sort(arr);
        
        return arr[arr.length-1];
    }
    */
    
    // 3nd Approach: Optimal Approach => TC = O(n) , SC = O(1)
    public static int getLargestElement(int[] arr) {
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        
        return max;
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = getLargestElement(arr);
        System.out.println(ans);
        
        sc.close();
    }
}
