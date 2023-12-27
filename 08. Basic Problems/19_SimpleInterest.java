// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float p = sc.nextInt();
        float r = sc.nextInt();
        float t = sc.nextInt();
        
        float simpleInterest = (p * r * t) / 100;
        
        System.out.println(simpleInterest);
        
        sc.close();
    }
}
