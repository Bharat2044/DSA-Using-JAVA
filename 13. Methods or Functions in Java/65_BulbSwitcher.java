// Question Link: https://leetcode.com/problems/bulb-switcher/
// Solution Link: https://leetcode.com/problems/bulb-switcher/solutions/5414324/all-5-approaches-in-java-optimal-better-and-brute-approach-beats-100-runtime-0ms/

class Solution {

    // 1st Approach: Brute Force => TC = O(n^2), SC = O(1) -> TLE (Time Limit Exceed)
    /*
    public int bulbSwitch(int n) {      
        int cnt = 0; // Initialize counter for bulbs that remain on

        for(int i = 1; i <= n; i++) { // Loop through each bulb
            boolean flag = false; // Initialize flag to track bulb state

            for(int j = 1; j <= i; j++) { // Loop through each toggle operation
                if(i % j == 0) // Check if j is a divisor of i
                    flag = !flag; // Toggle the flag
            }

            if(flag) // If the flag is true, the bulb is on
                cnt++; // Increment the counter
        }

        return cnt; // Return the count of bulbs that remain on
    }
    */


    // 2nd Approach: Brute Force with Extra Space => TC = O(n * log(n)), SC = O(n) -> TLE (Time Limit Exceed)
    /*
    public int bulbSwitch(int n) { 
        boolean[] temp = new boolean[n + 1]; // Initialize an array to track bulb states

        for(int i = 1; i <= n; i++) { // Loop through each bulb
            for(int j = i; j <= n; j += i) { // Loop through each toggle operation
                temp[j] = !temp[j]; // Toggle the bulb state
            }
        }

        int cnt = 0; // Initialize counter for bulbs that remain on

        for(int i = 1; i <= n; i++) { // Loop through the bulb states array
            if (temp[i]) { // If the bulb is on
                cnt++; // Increment the counter
            }
        }

        return cnt; // Return the count of bulbs that remain on
    }
    */


    // 3rd Approach: Better Approach - Using Loops => TC = O(sqrt(n)), SC = O(1)
    /*
    public int bulbSwitch(int n) {   
        int cnt = 0; // Initialize counter for bulbs that remain on

        for(int i = 1; i * i <= n; i++) { // Loop through numbers whose squares are less than or equal to n
            cnt++; // Each such number corresponds to a bulb that will remain on
        }

        return cnt; // Return the count of bulbs that remain on
    }
    */


    // 4th Approach: Optimal Approach - Using Binary Search => TC = O(log(n)), SC = O(1)
    public int bulbSwitch(int n) {   
        int st = 0, end = n, ans = 0; // Initialize start, end, and answer variables

        while (st <= end) { // Binary search loop
            int mid = st + (end - st) / 2; // Calculate mid-point to avoid overflow
            long square = (long) mid * mid; // Calculate square of mid, using long to avoid overflow

            if (square == n) { // If square of mid equals n
                return mid; // Return mid as the answer
            } else if (square > n) { // If square of mid is greater than n
                end = mid - 1; // Adjust end to mid - 1
            } else { // If square of mid is less than n
                ans = mid; // Update answer to mid
                st = mid + 1; // Adjust start to mid + 1
            }
        }

        return ans; // Return the final answer
    }


    // 5th Approach: Using Predefined Function => TC = O(log(n)), SC = O(1)
    /*
    public int bulbSwitch(int n) { 
        
        return (int)Math.sqrt(n); // Return the integer part of the square root of n
    }
    */
}
