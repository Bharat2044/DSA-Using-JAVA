import java.util.Scanner;

public class AverageOfNInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        double sum = 0;

        System.out.println("Enter " + n + " number");
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        double average = sum / n;
        System.out.println("Average: " + average);

        sc.close();
    }
}
