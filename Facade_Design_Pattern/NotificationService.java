package Facade_Design_Pattern;

public class NotificationService {
    public void sendConfirmation(String productId){
        System.out.println("Sending order confirmation for product : " + productId);
    }
}
