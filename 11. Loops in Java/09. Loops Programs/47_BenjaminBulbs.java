// Question Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion
// i/p: n = 6,   o/p: 1 4
// i/p: n = 25,   o/p: 1 4 9 16 25


import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        
        
        // 1st Approach => TC = O(n^2), SC = O(1)
        /*
        for(int i=1; i<=n; i++) {
            boolean flag = false;
            
            for(int j=1; j<=n; j++) {
                if(i % j == 0) {
                    flag = !flag;
                }
            }
            
            if(flag == true) {
                System.out.print(i + "  ");
            }
        }
        */


        // 2nd Approach => TC = O(sqrt(n)), SC = O(1)
        for(int i=1; i*i<=n; i++) {
            System.out.print((i * i) + "  ");
        }   
        
        sc.close();
    }
}
