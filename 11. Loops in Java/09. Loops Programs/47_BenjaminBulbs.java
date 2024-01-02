// Question Link: https://www.pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion
// i/p: n = 6,   o/p: 1 4
// i/p: n = 25,   o/p: 1 4 9 16 25


import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();

        for(int i=1; i*i<=n; i++) {
            System.out.print((i * i) + "  ");
        }        
        
        sc.close();
    }
}
