package Facade_Design_Pattern;

public class PaymentService {
    public boolean makePayment(String paymentMethod){
        System.out.println("Processing Payment using : "+paymentMethod);
        return true;
    }
}
