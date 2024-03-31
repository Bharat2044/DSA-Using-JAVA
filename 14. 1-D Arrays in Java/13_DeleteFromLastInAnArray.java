import java.util.Scanner;

public class DeleteFromLastInAnArray {
  	
  	// TC = O(n), SC = O(n)
  	public static int[] deleteFromLast(int[] arr) {
  	    int[] newArr = new int[arr.length - 1];
  
    		for (int i = 0; i < arr.length - 1;  i++) {
    			  newArr[i] = arr[i];
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
    		
    		System.out.print("Before delete array elements are: ");
    		printArray(arr);
    		    		
    		arr = deleteFromLast(arr);
    		
    		System.out.print("After  delete array elements are: ");
    		printArray(arr);
  	}
}
