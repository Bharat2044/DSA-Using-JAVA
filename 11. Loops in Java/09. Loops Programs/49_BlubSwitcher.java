// Question Link: https://leetcode.com/problems/bulb-switcher/description/


class Solution {

    // 1st Approach => TC = O(n^2), SC = O(1) -> TLE (Time Limit Exceed)
    /*
    public int bulbSwitch(int n) {      
        int cnt = 0;

        for(int i=1; i<=n; i++) {
            boolean flag = false;

            for(int j=1; j<=i; j++) {
                if(i % j == 0)
                    flag = !flag;
            }

            if(flag)
                cnt++;
        }

        return cnt;        
    }
    */


    // 2nd Approach => TC = O(sqrt(n)), SC = O(1)
    /*
    public int bulbSwitch(int n) {   
        int cnt = 0;

        for(int i=1; i*i<=n; i++) {
            cnt++;
        }

        return cnt;
    }
    */


    // 3rd Approach => Using Predefined Function -> TC = O(sqrt(n)), SC = O(1)
    public int bulbSwitch(int n) { 
        
        return (int)Math.sqrt(n);
    }
}
