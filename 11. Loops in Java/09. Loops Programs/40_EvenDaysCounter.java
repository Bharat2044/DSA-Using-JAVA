// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.


public class EvenDaysCounter {
    public static void main(String[] args) {
        int countEvenDays = 0;

        System.out.println("Counting the number of even days in August.");

        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                countEvenDays++;
            }
        }

        System.out.println("Number of days Raj can go out in August: " + countEvenDays);
    }
}
