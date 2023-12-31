public class CosValue {
    public static void main(String[] args) {

        System.out.println(Math.cos(60));  
        System.out.println(Math.cos(Math.toRadians(60)));  

        System.out.println(Math.cos(90));  
        System.out.println(Math.cos(Math.toRadians(900)));  

        System.out.println(Math.cos(1.0/0));  
        System.out.println(Math.cos(Math.toRadians(1.0/0)));  
    }
}