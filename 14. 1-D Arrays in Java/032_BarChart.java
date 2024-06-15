// Question Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion

/*
i/p: n = 5
arr = 2 3 1 4 5
o/p:
        * 
      * *
  *   * *
* *   * *
* * * * *

*/


import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        
        // Input the number of bars (columns) in the bar chart
        int n = sc.nextInt();
        
        // Initialize an array to store heights of bars
        int[] arr = new int[n];
        
        // Input heights of each bar
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Finding the maximum height among all bars
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        
        // Printing the bar chart
        // Each row corresponds to a height level from max to 1
        for(int ht = max; ht >= 1; ht--) {
            // Traverse each column (bar) for the current height level
            for(int i = 0; i < arr.length; i++) {
                // If the current bar height is >= current height level, print "* "
                if(arr[i] >= ht)
                    System.out.print("* ");
                // Otherwise, print spaces to maintain alignment
                else
                    System.out.print("  ");
            }
            
            // Move to the next line for the next height level
            System.out.println();
        }
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }
}
