public class ArrayDeclarationAndInitialization {

  	public static void printArray(int[] arr) {
  
    		for (int i = 0; i < arr.length; i++) {
    			System.out.print(arr[i] + "  ");
    		}
    
    		System.out.println();
  	}
  
  	public static void main(String[] args) {
  
    		int[] arr1;
    		arr1 = new int[5];
    		arr1[0] = 5;
    		arr1[1] = 6;
    		arr1[2] = 7;
    
    		int[] arr2 = { 10, 20, 30, 40, 50 };
    
    		int[] arr3 = new int[] { 60, 70, 80, 90, 100 };
    		
    		int[] arr4 = new int[5];
    		
    		System.out.print("Array arr1 elements are: ");
    		printArray(arr1);
    
    		System.out.print("Array arr2 elements are: ");
    		printArray(arr2);
    
    		System.out.print("Array arr3 elements are: ");
    		printArray(arr3);
    
    		System.out.print("Array arr4 elements are: ");
    		printArray(arr4);
  	}
}
