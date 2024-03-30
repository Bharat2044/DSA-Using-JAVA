/*
i/p: 
n1 = 3
arr1 = 4 9 7
n2 = 5
arr2 = 9 4 6 3 2
o/p: 9 4 10 12 9
*/


import java.util.Scanner;

public class SumOfTwoArraysEasy {
  
    // TC = O(max(n1, n2)), SC = O(max(n1, n2))
    public static int[] sum(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        int[] temp = new int[n];
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = n - 1;
        
        while(i >= 0 && j >= 0) {
            temp[k] = arr1[i] + arr2[j];
            i--;
            j--;
            k--;
        }
        
        while(i >= 0) {
            temp[k] = arr1[i];
            i--;
            k--;
        }
        
        while(j >= 0) {
            temp[k] = arr2[j];
            j--;
            k--;
        }
        
        return temp;
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
        
        int[] result = sum(arr1, arr2);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "  ");
        }
        
        sc.close();
    }
}
