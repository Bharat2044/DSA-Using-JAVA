import java.util.Scanner;

public class SumOfArrayElements {
    
    // TC = O(n), SC = O(1)
    public static int arraySum(int[] arr) {
        int sum = 0;
        
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
            
        return sum;
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
        
        System.out.println("Sum of array elements = " + arraySum(arr));
        
        sc.close();
    }
}
