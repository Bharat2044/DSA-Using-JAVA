public class RightRotateByKTimes {
  
    public static void printArray(int[] arr) {
      
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");
            
        System.out.println();
    }
     
    /*
    // Approach - 1: Using Rotate One by One => TC = O(n * k), SC = O(1)
    public static void rightRotateByOne(int[] arr) {
        // Length of the array
        int n = arr.length; 
        
        // Store the last element of the array
        int x = arr[n - 1];
        
        // Shift elements to the right by one position
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Place the stored element at the beginning of the array
        arr[0] = x;
    }
    
    public static void rightRotateByKPosition(int[] arr, int k) {
        // Length of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Rotate the array `k` times by one position each time
        for (int i = 1; i <= k; i++) {
            rightRotateByOne(arr);
        }
    }
    */
    

    /*
    // Approach - 2: Using Auxiliary Array => TC = O(n), SC = O(n)
    public static void rightRotateByKPosition(int[] arr, int k) {
        // Size of the array
        int n = arr.length;
    
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Create a temporary array to store rotated elements
        int[] temp = new int[n];
        
        // Index variable for tracking position in the temporary array
        int j = 0;
    
        // Copy the last `k` elements of the original array to the temporary array
        for (int i = n - k; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        
        // Copy the remaining elements (first `n-k` elements) of the original array to the temporary array
        for (int i = 0; i < n - k; i++) {
            temp[j] = arr[i];
            j++;
        }
        
        // Copy elements from the temporary array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    */
    
    // Approach - 3: Using Auxiliary Array => TC = O(n), SC = O(k)
    public static void rightRotateByKPosition(int[] arr, int k) {
        // Size of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Create a temporary array to store rotated elements
        int[] temp = new int[k];
        
        // Copy the last `k` elements of the original array to the temporary array
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = arr[i];
        }
        
        // Shift elements to the right by `k` positions
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        
        // Copy elements from the temporary array to the beginning of the array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }


    
    /*
    // Approach - 4: By Reversing Array => TC = O(n), SC = O(1)
    public static void rightRotateByKPosition(int[] arr, int k) {
        // size of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
    
        // Reverse the last `k` elements
        reverse(arr, n - k, n - 1);
        
        // Reverse the first `n-k` elements
        reverse(arr, 0, n - k - 1);
        
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }
    
    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            // Swap elements at indices `s` and `e`
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            
            // Move `s` towards the end and `e` towards the start
            s++;
            e--;
        }
    }
    */
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before right rotate by k position array are:");
        printArray(arr);
        
        rightRotateByKPosition(arr, k);

        System.out.println("\nAfter right rotate by k position array are:");
        printArray(arr);
    }
}
