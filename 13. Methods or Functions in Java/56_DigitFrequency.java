// i/p: n = 994543234, d= 4
// o/p: 3


import java.util.Scanner;

public class DigitFrequency {
  
    // TC = O(log10(n), SC = O(1)
    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        
        while(n != 0) {
            if(n % 10 == d) {
                count++;
            }
            
            n /= 10;
        }
        
        return count;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int ans = getDigitFrequency(n, d);
      
        System.out.println(ans);
    }
}
