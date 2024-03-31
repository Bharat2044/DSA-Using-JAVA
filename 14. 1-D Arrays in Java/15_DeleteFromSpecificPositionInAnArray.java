import java.util.Scanner;

public class DeleteFromSpecificPositionInAnArray {
  	
  	// TC = O(n), SC = O(n)
  	public static int[] deleteFromSpecificPosition(int[] arr, int pos) {
  	    int[] newArr = new int[arr.length - 1];
  
    		for (int i = 0; i < newArr.length;  i++) {
    			  if(i < pos - 1) 
    			      newArr[i] = arr[i];
    		    else
    		        newArr[i] = arr[i + 1];

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
    		
    		System.out.print("Enter the position: ");
    		int pos = sc.nextInt();
    		
    		if(pos <= 0 || pos > arr.length) {
    		    System.out.println("Enter a valid position");
    		    return;
    		}
    		
    		System.out.print("Before delete array elements are: ");
    		printArray(arr);
    		
    		arr = deleteFromSpecificPosition(arr, pos);
    		
    		System.out.print("After  delete array elements are: ");
    		printArray(arr);
  	}
}
