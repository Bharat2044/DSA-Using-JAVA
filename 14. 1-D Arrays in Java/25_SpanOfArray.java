/*
Span of Array -> pan is defined as difference of maximum value and minimum value.
i/p: 
n = 5
arr = 5 12 6 7 4
o/p: 8 
Explanation: max = 12, min = 4 => 12 - 4 = 8
*/


import java.util.Scanner;
import java.util.Arrays;

public class SpanOfArray {
    // TC = O(n) , SC = O(1)
    public static int getLargestElement(int[] arr) {
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        
        return max;
    }
    
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
        
        int maxi = getLargestElement(arr);
        int mini = getSmallestElement(arr);
        
        System.out.println(maxi - mini);
        
        sc.close();
    }
}
