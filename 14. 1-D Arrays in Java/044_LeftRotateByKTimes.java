public class LeftRotateByKTimes {
  
    // printing the arrays
    public static void printArray(int[] arr) {
      
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");
            
        System.out.println();
    }
    
    /*
    // Approach - 1: Using Rotate One by One => TC = O(n * k), SC = O(1)
     public static void leftRotateByOne(int[] arr) {
        // Length of the array
        int n = arr.length;
        
        // Store the first element of the array
        int x = arr[0];
        
        // Shift elements to the left by one position
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        
        // Place the stored element at the end of the array
        arr[n - 1] = x;
    }
    
    public static void leftRotateByKPosition(int[] arr, int k) {
        // Length of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Rotate the array `k` times by one position each time
        for (int i = 1; i <= k; i++) {
            leftRotateByOne(arr);
        }
    }
    */
    
    

    /*    
    // Approach - 2: Using Auxiliary Array => TC = O(n), SC = O(n)
    public static void leftRotateByKPosition(int[] arr, int k) {
        // Size of the array
        int n = arr.length;
    
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Create a temporary array to store rotated elements
        int[] temp = new int[n];
        
        // Index variable for tracking position in the temporary array
        int j = 0;
    
        // Copy elements from index `k` to the end of the original array to the temporary array
        for (int i = k; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        
        // Copy elements from the beginning of the original array up to index `k` to the temporary array
        for (int i = 0; i < k; i++) {
            temp[j] = arr[i];
            j++;
        }
        
        // Copy elements from the temporary array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    */
    
    
    /*
    // Approach - 3: Using Auxiliary Array => TC = O(n), SC = O(k)
    public static void leftRotateByKPosition(int[] arr, int k) {
        // Size of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
        
        // Create a temporary array to store rotated elements
        int[] temp = new int[k];
        
        // Copy the first `k` elements of the original array to the temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        
        // Shift elements to the left by `k` positions
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        
        // Copy elements from the temporary array to the end of the array
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
    */
    
    
    // Approach - 4: By Reversing Array => TC = O(n), SC = O(1)
    public static void leftRotateByKPosition(int[] arr, int k) {
        // Size of the array
        int n = arr.length;
        
        // Adjust `k` if it is greater than the size of the array
        k = k % n;
    
        // Reverse the first `k` elements
        reverse(arr, 0, k - 1);
    
        // Reverse the remaining elements
        reverse(arr, k, n - 1);
        
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


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 4;

        System.out.println("Before left rotate by k position array are:");
        printArray(arr);
        
        leftRotateByKPosition(arr, k);

        System.out.println("\nAfter left rotate by k position array are:");
        printArray(arr);
    }
}
