import java.util.Arrays;

public class MinAndMaxElement {
  
    /*
    // 1st Approach: TC = O(n * log(n)), SC = O(1)
    public static int[] getMinMax(int[] arr) {
    		Arrays.sort(arr);
    		
        return new int[] { arr[0], arr[arr.length - 1] };
    }
    */
  
    // 2nd Approach: TC = O(n), SC = O(1)
    public static int[] getMinMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i]; 
            }
        }
        
        return new int[] { min, max };
    }


  	public static void main(String[] args) {
    		int[] arr = { 10, 40, 50, -60, 20, 90, 70, -80 };
    		
    		int[] ans = getMinMax(arr);
    
    		System.out.println("Minimum Element = " + ans[0]);
    		System.out.println("Maximum Element = " + ans[1]);
  	}
}
