public class LeftRotateByOnePosition {
  
    public static void printArray(int[] arr) {
      
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");
            
        System.out.println();
    }
    
    // TC = O(n), SC = O(1)
    public static void leftRotateByOne(int[] arr) {
        int n = arr.length;
        int x = arr[0];
        
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        
        arr[n - 1] = x;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Before left rotate by 1 position array are:");
        printArray(arr);
        
        leftRotateByOne(arr);

        System.out.println("\nAfter left rotate by 1 position array are:");
        printArray(arr);
    }
}
