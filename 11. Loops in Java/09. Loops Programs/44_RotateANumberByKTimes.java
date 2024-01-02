// Question Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion


import java.util.Scanner;

public class RotateANumberByKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int noOfDigit = 0, temp = n;
        
        while(temp != 0) {
            noOfDigit++;
            temp /= 10;
        }
        
        k = k % noOfDigit;
        if(k < 0) 
            k += noOfDigit;
          
        int div = 1, mult = 1;
        
        for(int i=1; i<=noOfDigit; i++) {
            if(i <= k)
                div *= 10;
            else
                mult *= 10;
        }
            
        int q = n / div;
        int r = n % div;
        
        int ans = r * mult + q;
        System.out.println(ans);
        
        
        /*
        int noOfDigit = 0, temp = n;
        
        while(temp != 0) {
            noOfDigit++;
            temp /= 10;
        }
        
        k = k % noOfDigit;
        if(k < 0) 
            k += noOfDigit;
            
        int front = n / (int)Math.pow(10, k);
        int last = n % (int)Math.pow(10, k);
        last = last * (int)Math.pow(10, noOfDigit - k);
        
        int ans = front + last;
        System.out.println(ans);
        */
        
        sc.close();
    }
}
