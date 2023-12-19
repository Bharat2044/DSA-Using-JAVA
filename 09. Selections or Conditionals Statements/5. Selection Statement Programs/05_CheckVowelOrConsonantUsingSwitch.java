import java.util.Scanner;

public class CheckVowelOrConsonantUsingSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        
        switch (ch) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> System.out.println("The alphabet is vowel");
            
            case 'b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L', 'm','M', 'n', 'N', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z' -> System.out.println("The alphabet is constant");
                
            default -> System.out.println("It is not an alphabet");
        }       


        /*
        switch (ch) {
             'a', 
             'A', 
             'e', 
             'E', 
             'i', 
             'I', 
             'o', 
             'O', 
             'u', 
             'U', 
                System.out.println("The alphabet is vowel");
                break;
            
             'b', 
             'B', 
             'c', 
             'C', 
             'd', 
             'D', 
             'f', 
             'F', 
             'g', 
             'G', 
             'h', 
             'H', 
             'j', 
             'J', 
             'k', 
             'K', 
             'l', 
             'L', 
             'm', 
             'M', 
             'n', 
             'N', 
             'p', 
             'P', 
             'q', 
             'Q', 
             'r', 
             'R', 
             's', 
             'S', 
             't', 
             'T', 
             'v', 
             'V', 
             'w', 
             'W', 
             'x', 
             'X', 
             'y', 
             'Y', 
             'z', 
             'Z', 
                System.out.println("The alphabet is constant");
                break;

            default, 
                System.out.println("It is not an alphabet");
        }       
        */
    }
}
