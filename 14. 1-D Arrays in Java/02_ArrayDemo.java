public class ArrayDemo {

  	public static void main(String[] args) {
  
    		boolean[] arr1 = new boolean[5];
    		arr1[0] = true;
    		arr1[2] = false;
    		arr1[4] = true;
    		
    		System.out.print("Array arr1 elements are: ");
    		for(int i=0; i<arr1.length; i++) {
    			System.out.print(arr1[i] + "  ");
    		}
    		System.out.println("\n");
    		
    		
    		double[] arr2 = {5.5, 6.8, 9.2, 3.5};
    		
    		System.out.print("Array arr2 elements are: ");
    		for(int i=0; i<arr2.length; i++) {
    			System.out.print(arr2[i] + "  ");
    		}
    		System.out.println("\n");
    		
    		
    		char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
    		
    		System.out.print("Array arr3 elements are: ");
    		for(int i=0; i<arr3.length; i++) {
    			System.out.print(arr3[i] + "  ");
    		}
    		System.out.println("\n");
  	}
}
