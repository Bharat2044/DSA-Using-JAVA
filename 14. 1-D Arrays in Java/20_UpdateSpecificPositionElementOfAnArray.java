import java.util.Scanner;

public class UpdateSpecificPositionElementOfAnArray {
  	
  	// TC = O(1), SC = O(1)
  	public static void updateSpecificPositionElement(int[] arr, int pos, int x) {

  	    arr[pos - 1] = x;
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
    		
    		System.out.print("Enter the position: ");
    		int pos = sc.nextInt();
    		
    		System.out.print("Enter the element: ");
    		int x = sc.nextInt();
    		
    		if(pos <= 0 || pos > arr.length) {
    		    System.out.println("Enter a valid position");
    		    return;
    		}
    		
    		System.out.print("Before update array elements are: ");
    		printArray(arr);
    		
    		updateSpecificPositionElement(arr, pos, x);
    		
    		System.out.print("After  update array elements are: ");
    		printArray(arr);
  	}
}
