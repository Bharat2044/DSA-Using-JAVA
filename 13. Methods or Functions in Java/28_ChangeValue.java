import java.util.Arrays;

public class ChangeValue {
  
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45, 6};  // Create an array of integers
        
        System.out.println("Before changing array value : " + Arrays.toString(arr));  // Print array before change
        
        change(arr);  // Call method to change array
        
        System.out.println("After  changing array value : " + Arrays.toString(arr));  // Print array after change
    }

    // Method to change the first element of the array
    public static void change(int[] nums) {
        nums[0] = 99;  // Change the first element of the array to 99
    }
}

// if you make a change to the object via this ref variable, same object will be changed
