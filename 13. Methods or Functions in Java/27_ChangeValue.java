import java.util.Arrays;

public class ChangeValue{
    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 3, 2, 45, 6};
        
        System.out.println("Before changing array value : " + Arrays.toString(arr));
        
        change(arr);
        
        System.out.println("After  changing array value : " + Arrays.toString(arr));
    }

    public static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }
}