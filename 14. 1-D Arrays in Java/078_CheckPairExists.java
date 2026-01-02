/*
Given an array of elements, check whether there exists a pair ((i, j)) such that arr[i] + arr[j] = k and i != j.

Input:
arr[] = {3, -2, 1, 4, 3, 6, 8}, k = 10
Output: true

Input:
arr[] = {2, 4, -3, 7},  k = 5
Output: false

Input:
arr[] = {2, 4, -3, 7},  k = 5
Output: false
*/



import java.util.*; // Imports utility classes like Scanner, Arrays, HashMap, HashSet

public class CheckPairExists {

    /*
    ----------------------------------------------------
    Approach - 1: Using Two Nested Loops (Brute Force)
    ----------------------------------------------------
    Time Complexity  : O(n^2)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static boolean countPairs(int[] arr, int k) {

        // Get the length of the array
        int n = arr.length;

        // Loop to pick the first element
        for (int i = 0; i < n - 1; i++) {

            // Loop to pick the second element
            for (int j = i + 1; j < n; j++) {

                // Check if the sum of two elements equals k
                if (arr[i] + arr[j] == k) {
                    return true; // Pair found
                }
            }
        }

        // No pair found
        return false;
    }
    */


    /*
    ----------------------------------------------------
    Approach - 2: Using Sorting + Two Pointers
    ----------------------------------------------------
    Time Complexity  : O(n log n)
    Space Complexity : O(1)
    ----------------------------------------------------
    */
    /*
    public static boolean countPairs(int[] arr, int k) {

        // Get the length of the array
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0;
        int right = n - 1;

        // Loop until pointers meet
        while (left < right) {

            // Calculate sum of elements at left and right
            int sum = arr[left] + arr[right];

            // If sum equals k, pair found
            if (sum == k) {
                return true;
            }
            // If sum is greater than k, move right pointer left
            else if (sum > k) {
                right--;
            }
            // If sum is less than k, move left pointer right
            else {
                left++;
            }
        }

        // No valid pair found
        return false;
    }
    */


    /*
    ----------------------------------------------------
    Approach - 3: Using HashMap (Optimal)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    /*
    public static boolean countPairs(int[] arr, int k) {

        // Create a HashMap to store elements and their frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse each element in the array
        for (int num : arr) {

            // Calculate required value to make sum = k
            int target = k - num;

            // Check if target already exists in map
            if (map.containsKey(target)) {
                return true; // Pair found
            }

            // Store current element in the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // No pair found
        return false;
    }
    */


    /*
    ----------------------------------------------------
    Approach - 4: Using HashSet (Most Simple & Optimal)
    ----------------------------------------------------
    Time Complexity  : O(n)
    Space Complexity : O(n)
    ----------------------------------------------------
    */
    public static boolean countPairs(int[] arr, int k) {

        // Create a HashSet to store visited elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int num : arr) {

            // Calculate required number
            int target = k - num;

            // If target exists in set, pair found
            if (set.contains(target)) {
                return true;
            }

            // Add current number to set
            set.add(num);
        }

        // No valid pair found
        return false;
    }

    // main method
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        // Create array of given size
        int[] arr = new int[n];

        // Take array elements from user
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take target sum k
        System.out.print("Enter target element: ");
        int k = sc.nextInt();

        // Call method to check if pair exists
        boolean result = countPairs(arr, k);

        // Print result
        System.out.println(result);
    }
}
