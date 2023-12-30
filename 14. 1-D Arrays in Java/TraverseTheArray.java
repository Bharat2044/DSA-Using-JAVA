import java.util.Scanner;
import java.util.*;

public class TraverseTheArray {
  
    //  1st Approach: Using for loop => TC = O(n), SC = O(1)
    /*
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements are: ");
        
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println();
    }
    */
    
    //  2nd Approach: Using for-each loop => TC = O(n), SC = O(1)
    /*
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements are: ");
        
        for(int ele : arr) {
            System.out.print(ele + "  ");
        }
        
        System.out.println();
    }
    */
    
    //  3rd Approach: Using toString() method => TC = O(n), SC = O(1)
    /*
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements are: ");
        
        System.out.print(Arrays.toString(arr));
        
        System.out.println();
    }
    */
    
    //  4th Approach: Using Spliterator Iterator => TC = O(n), SC = O(1)
    public static void traverseArray(int[] arr) {
        System.out.println("Array elements are: ");
        
        Spliterator<Integer> sp = Arrays.spliterator(arr);
        sp.forEachRemaining((k) -> {
            System.out.print(k + "  ");
        });
        
        System.out.println();
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        traverseArray(arr);
        
        sc.close();
    }
}
