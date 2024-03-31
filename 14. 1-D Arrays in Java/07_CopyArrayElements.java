import java.util.Arrays;

public class CopyArrayElements {

  	public static void printArray(int[] arr) {
  
    		for (int i = 0; i < arr.length; i++) {
    			  System.out.print(arr[i] + "  ");
    		}
    
    		System.out.println();
  	}
  
  
  	public static void main(String[] args) {
    		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    		
    		System.out.println("Iterating each element of the given original array and copy one element at a time:");
    		// Create an array b[] of same size as a[] 
    		int[] b = new int[a.length];
    		
    		// Copying elements of a[] to b[] 
    		for (int i = 0; i < a.length; i++) {
    			  b[i] = a[i];
    		}
    		
    		// Changing b[] to verify that b[] is different from a[] 
    		b[0]++;
    		
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of b[]: "); 
    		printArray(b);
    		
    		
    		System.out.println("\n\nUsing Clone() method:");
    		// Copying elements of a[] to c[] 
        int[] c = a.clone(); 
        
        // Changing c[] to verify that c[] is different from a[] 
    		c[0]++;
    		
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of c[]: "); 
    		printArray(c);
    		
    		
    		System.out.println("\n\nUsing arraycopy() method:");
    		// Creating an array d[] of same size as a[] 
        int[] d = new int[a.length]; 
        
        // Copying elements of a[] to d[] 
        System.arraycopy(a, 0, d, 0, 9); 
        
        // Changing d[] to verify that d[] is different from a[] 
    		d[0]++;
    		
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of d[]: "); 
    		printArray(d);
    		
    		
    		System.out.println("\n\nUsing copyOf() method of Arrays class:");
    		// Create an array e[] of same size as a[] and Copy elements of a[] to e[] 
        int[] e = Arrays.copyOf(a, 9);
        
        // Changing e[] to verify that e[] is different from a[] 
    		e[0]++;
    		
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of e[]: "); 
    		printArray(e);
    		
    		
    		System.out.println("\n\nUsing copyOfRange() method of Arrays class:");
    		// Create an array f[] of same size as a[] and Copy elements of a[] to f[] 
        int[] f = Arrays.copyOfRange(a, 2, 9);
        
        // Changing f[] to verify that f[] is different from a[] 
    		f[0]++;
    		
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of f[]: "); 
    		printArray(f);
    		
    		
    		System.out.println("\n\nCopy array reference:");

    		// Create an array g[] of same size as a[] 
        int[] g = new int[a.length]; 
  
        // Doesn't copy elements of a[] to g[], only makes g refer to same location 
        g = a; 
  
        // Change to g[] will also reflect in a[], as 'a' and 'g' refer to same location. 
        g[0]++; 
        
    		System.out.println("Contents of a[]: "); 
    		printArray(a);
    		System.out.println("Contents of g[]: "); 
    		printArray(g);
  	}
}
