import java.util.Scanner;

public class LinearSearch {
  
    //  TC = O(n), SC = O(1)
    public static int linearSearch(int[] arr, int key) {
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        
        return -1;
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
        
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt();
        
        int result = linearSearch(arr, key);
        
        if(result == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}
