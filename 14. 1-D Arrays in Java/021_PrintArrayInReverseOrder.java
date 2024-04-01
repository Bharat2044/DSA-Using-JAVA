import java.util.Scanner;

public class PrintArrayInReverseOrder {
    
    // TC = O(n), SC = O(1)
    public static void printArrayInReverse(int[] arr) {
        
        System.out.println("Array elements are in reverse order: ");
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + "  ");
        }
        
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
        
        printArrayInReverse(arr);
        
        sc.close();
    }
}
