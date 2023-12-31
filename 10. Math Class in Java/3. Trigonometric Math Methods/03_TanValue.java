public class TanValue {
    public static void main(String[] args) {

        System.out.println(Math.tan(60));  
        System.out.println(Math.tan(Math.toRadians(60)));  

        System.out.println(Math.tan(90));  
        System.out.println(Math.tan(Math.toRadians(900)));  

        System.out.println(Math.tan(1.0/0));  
        System.out.println(Math.tan(Math.toRadians(1.0/0)));  
    }
}