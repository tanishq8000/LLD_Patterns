package Facade_Design_Pattern;

public class OrderFacade {
    private final InventoryService inventory;
    private final PaymentService payment;
    private final ShippingService shipping;
    private final NotificationService notification;

    public OrderFacade(){
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.shipping = new ShippingService();
        this.notification = new NotificationService();
    }

    public void placeOrder(String productId, String paymentMethod){
        System.out.println("Placing order for the product : "+productId);

        if(!inventory.checkStock(productId)){
            System.out.println("Selected product is out of stock");
            return;
        }

        if(!payment.makePayment(paymentMethod)){
            System.out.println("Payment Failed !!!");
            return;
        }

        shipping.shipProduct(productId);
        notification.sendConfirmation(productId);

        System.out.println("Order Placed Successfully");
    }
}
