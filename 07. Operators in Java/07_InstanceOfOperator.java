public class InstanceOfOperator {
    public static void main(String[] args) {
        String str = "Bharat";
        
        boolean result = str instanceof String;
        System.out.println("Is str an object of String? " + result);
        
        InstanceOfOperator i = new InstanceOfOperator();
        System.out.println(i instanceof InstanceOfOperator);
    }
}
