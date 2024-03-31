public class UpdatingArrayElements {

  	public static void printArray(int[] arr) {
  
    		for (int i = 0; i < arr.length; i++) {
    			System.out.print(arr[i] + "  ");
    		}
    
    		System.out.println();
  	}
  
  	public static void main(String[] args) {
    		int[] arr1 = { 10, 20, 30, 40, 50 };
    
    		System.out.println("Printing array arr1 elements before updating: ");
    		printArray(arr1);
    
    		arr1[0] = 11; // updaing 1st element
    		arr1[2] = 33; // updaing 3rd element
    		arr1[4] = 55; // updaing 5th element
    
    		System.out.println("Printing array arr1 elements after updating: ");
    		printArray(arr1);
    		
    
    		int[] arr2 = { 25, 26, 27, 28, 29 };
    
    		System.out.println("\nPrinting array arr2 elements before updating: ");
    		printArray(arr2);
    
    		// updating array arr2
    		for (int i = 0; i < arr2.length; i++) {
    			arr2[i] = arr2[i] + 10;
    		}
    
    		System.out.println("Printing array arr2 elements after updating: ");
    		printArray(arr2);
  	}
}
