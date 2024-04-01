import java.util.Scanner;

public class BinarySearch {
  
    // Approach - 1: Using Loops => TC = O(log(n)), SC = O(1)
    /*
    public static int binarySearch(int[] arr, int key) {
        
        int left = 0, right = arr.length - 1, index = -1;

    		while (left <= right) {
      			int mid = (left + right) / 2;
      
      			if (arr[mid] == key) {
        				return mid;
      			} else if (arr[mid] > key) {
      				  right = mid - 1;
      			} else {
      				  left = mid + 1;
      			}
    		}
        
        return -1;
    }
    */
    
    // Approach - 2: Using Recursions => TC = O(log(n)), SC = O(log(n))
    public static int helper(int[] arr, int left, int right, int key) {
        if(left <= right) {
            int mid = (left + right) / 2;
          
          	if (arr[mid] == key) {
            		return mid;
          	} else if (arr[mid] > key) {
          		  return helper(arr, left, mid - 1, key);
          	} else {
          		  return helper(arr, mid + 1, right, key);
          	}
        }
        
        return -1;
    }
    
    public static int binarySearch(int[] arr, int key) {
        
        return helper(arr, 0, arr.length - 1, key);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements in sorted order: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to find in array: ");
        int key = sc.nextInt();
        
        int result = binarySearch(arr, key);
        
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}
