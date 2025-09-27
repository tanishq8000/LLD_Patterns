package Template_Method_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow friendPayment = new PayToFriendFlow();
        PaymentFlow merchantPayemnt = new PayToMerchantFlow();

        System.out.println("Sending Money to Friend");
        friendPayment.sendMoney();

        System.out.println();

        System.out.println("Sending money to Merchant");
        merchantPayemnt.sendMoney();
    }
}
