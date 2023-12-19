public class NestedIfStatementEx1 {
    public static void main(String[] args) {
        if(true) {
            if(false)
                System.out.println("Hi");

            if(true)
                System.out.println("Hello");
                
            System.out.println("Hola");
        }
    }
}