/*
i/p: 
n = 5
arr = 2 12 -6 70 5
o/p: -6
*/


import java.util.Scanner;
import java.util.Arrays;

public class SmallestElementInArray {
    /*
    // 1st Approach: Brute Force => TC = O(n^2) , SC = O(1)
    public static int getSmallestElement(int[] arr) {
      
        for(int i = 0; i < arr.length; i++) {
            boolean flag = true;
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
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
    public static int getSmallestElement(int[] arr) {
        Arrays.sort(arr);
        
        return arr[0];
    }
    */
    
    
    // 3nd Approach: Optimal Approach => TC = O(n) , SC = O(1)
    public static int getSmallestElement(int[] arr) {
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        
        return min;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = getSmallestElement(arr);
        System.out.println(ans);
        
        sc.close();
    }
}
