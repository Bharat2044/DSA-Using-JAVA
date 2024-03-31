import java.util.Scanner;

public class InsertAtLastInAnArray {
  	
  	// TC = O(n), SC = O(n)
  	public static int[] insertAtLast(int[] arr, int x) {
  	    int[] newArr = new int[arr.length + 1];
  
    		for (int i = 0; i < arr.length;  i++) {
    			  newArr[i] = arr[i];
    		}
    		
    		newArr[arr.length] = x;
    		return newArr;
  	}
  
    public static void printArray(int[] arr) {
  
    		for (int i = 0; i < arr.length; i++) {
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
    		for(int i = 0; i < n; i++) {
    			  arr[i] = sc.nextInt();
    		}
    		
    		System.out.print("Enter the element you want to insert at last: ");
    		int x = sc.nextInt();
    		
    		System.out.print("Before insert array elements are: ");
    		printArray(arr);
    		
    		arr = insertAtLast(arr, x);
    		
    		System.out.print("After  insert array elements are: ");
    		printArray(arr);
  	}
}
