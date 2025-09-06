package Facade_Design_Pattern;

public class ECommerceApp {
    public static void main(String[] args) {
        System.out.println("------- Facade Design Pattern Demo --------");
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("MacBook Pro","Credit Card");
        orderFacade.placeOrder("Chess Board","UPI");
    }
}
