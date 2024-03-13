import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_ReadIntegerValue {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        int a = Integer.parseInt(br.readLine());
        
        System.out.println("The number is: " + a);
    }
}

