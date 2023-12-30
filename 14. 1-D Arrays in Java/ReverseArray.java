import java.util.Scanner;

public class ReverseArray {
  
    public static void printArray(int[] arr) {
        
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        
        System.out.println();    
    }
    
    // 1st Approach: Using extra array => TC = O(n), SC = O(n)
    /*
    public static void reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        
        //copy arr array elements into temp array
        for(int i=arr.length-1; i>=0; i--) {
            temp[j++] = arr[i];
        }   
        
        //copy temp array elements into arr array
        for(int i=0; i<arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    */
    
    // 2nd Approach: Using 2-pointer approach => TC = O(n), SC = O()
    public static void reverseArray(int[] arr) {
        int st = 0, end = arr.length-1;
        
        while(st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Before reversed array elements are: ");
        printArray(arr);
        
        reverseArray(arr);
        
        System.out.print("After  reversed array elements are: ");
        printArray(arr);
        
        sc.close();
    }
}
