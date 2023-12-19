import java.util.Scanner;

public class PrintGradeAccordingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
    
        if(marks >= 0 && marks < 33) 
            System.out.println("Fail");
        else if(marks >= 33 && marks <= 50) 
            System.out.println("D Grade");
        else if(marks >= 51 && marks <= 70) 
            System.out.println("C Grade");
        else if(marks >= 71 && marks <= 90) 
            System.out.println("B Grade");
        else if(marks >= 91 && marks <= 100) 
            System.out.println("A Grade");
        else
            System.out.println("Invalid marks");
    }
}
