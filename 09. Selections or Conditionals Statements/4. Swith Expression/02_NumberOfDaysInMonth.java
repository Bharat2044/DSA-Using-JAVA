import java.util.Scanner;

class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number between 1 to 12: ");
        int n = sc.nextInt();
        
        switch(n) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);

            case 2 -> System.out.println(28 / 29);
            
            case 4, 6, 9, 11 -> System.out.println(30);
            
            default -> System.out.println("You entered a wrong month number");
        }
    }
}