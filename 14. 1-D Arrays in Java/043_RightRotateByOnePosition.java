public class RightRotateByOnePosition {
  
    public static void printArray(int[] arr) {
      
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "   ");
            
        System.out.println();
    }
    
    // TC = O(n), SC = O(1)
    public static void rightRotateByOne(int[] arr) {
        int n = arr.length;
        int x = arr[n - 1];
        
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
         
        arr[0] = x;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Before right rotate by 1 position array are:");
        printArray(arr);
        
        rightRotateByOne(arr);

        System.out.println("\nAfter right rotate by 1 position array are:");
        printArray(arr);
    }
}
