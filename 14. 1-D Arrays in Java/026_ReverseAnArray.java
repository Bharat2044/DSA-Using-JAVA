import java.util.Scanner;

public class ReverseAnArray {

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    /*
    // 1st Approach: Using extra array => TC = O(n), SC = O(n)
    public static void reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        // Copy elements from arr to temp in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j++] = arr[i];
        }

        // Copy elements from temp back to arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
    */

    // 2nd Approach: Using 2-pointer approach => TC = O(n), SC = O(1)
    public static void reverseArray(int[] arr) {
        int st = 0, end = arr.length - 1;

        // Swap elements from start and end moving towards the center
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
      
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array before reversing
        System.out.print("Before reversed array elements are: ");
        printArray(arr);

        // Reverse the array using the chosen method
        reverseArray(arr);

        // Print array after reversing
        System.out.print("After reversed array elements are: ");
        printArray(arr);

        sc.close(); // Close the scanner
    }
}
