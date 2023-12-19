import java.util.Scanner;

public class CheckEvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int x = sc.nextInt();

        switch(x) {
            case 0:
                System.out.println("Number is Even");
                break;

            default:
                int y = x % 2;

                switch(y) {
                    case 0:
                        System.out.println("Number is Even");
                        break;
                    default:
                        System.out.println("Number is Odd");
                }
        }
    }
}
