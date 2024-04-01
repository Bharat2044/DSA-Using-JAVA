import java.util.Scanner;

public class TransitionLinearSearch {
  
    // TC = O(n), SC = O(1)
    public static int transitionLinearSearch(int[] arr, int key) {
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
              
                if(i != 0) {
                    int t = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = t;
                }
                
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
        
        int result = transitionLinearSearch(arr, key);
        
        if(result == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + result);
        }
        
        sc.close();
    }
}
