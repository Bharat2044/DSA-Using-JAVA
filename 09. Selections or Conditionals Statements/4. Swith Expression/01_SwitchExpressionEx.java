public class SwitchExpressionEx {
    public static void main(String[] args) {
        int num = 3;
    
        switch(num) {
            case 1 -> System.out.println("Number is " + num);
                
            case 2 -> System.out.println("Number is " + num);
                
            case 3 -> System.out.println("Number is " + num);
                
            case 4 -> System.out.println("Number is " + num);
                
            default -> System.out.println("Default Case");
        }
    }
}