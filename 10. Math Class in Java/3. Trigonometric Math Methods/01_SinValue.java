public class SinValue {
    public static void main(String[] args) {

        System.out.println(Math.sin(60));  
        System.out.println(Math.sin(Math.toRadians(60)));  

        System.out.println(Math.sin(90));  
        System.out.println(Math.sin(Math.toRadians(900)));  

        System.out.println(Math.sin(1.0/0));  
        System.out.println(Math.sin(Math.toRadians(1.0/0)));  
    }
}