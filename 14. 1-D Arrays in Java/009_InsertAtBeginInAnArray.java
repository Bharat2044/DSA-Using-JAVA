import java.util.Scanner;

public class InsertAtBeginInAnArray {
  	
  	// TC = O(n), SC = O(n)
  	public static int[] insertAtBegin(int[] arr, int x) {
  	    int[] newArr = new int[arr.length + 1];
  
        newArr[0] = x;
        
    		for (int i = 1; i < newArr.length;  i++) {
    			  newArr[i] = arr[i-1];
    		}
    		
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
    		
    		System.out.print("Enter the element you want to insert at beginning: ");
    		int x = sc.nextInt();
    		
    		System.out.print("Before insert array elements are: ");
    		printArray(arr);
    		
    		arr = insertAtBegin(arr, x);
    		
    		System.out.print("After  insert array elements are: ");
    		printArray(arr);
  	}
}
