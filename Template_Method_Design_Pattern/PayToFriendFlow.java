package Template_Method_Design_Pattern;

public class PayToFriendFlow extends PaymentFlow {
    @Override
    public void validateRequest(){
        System.out.println("Validating Request for Pay to Friend Payment");
    }

    @Override
    public void debitAmount(){
        System.out.println("Amount debited from sender's account");
    }

    @Override
    public void calculatePlatformFees(){
        System.out.println("Calculating platform fees for pay to friend payment");
    }

    @Override
    public void creditAmount(){
        System.out.println("Amount is credited to friend's bank account");
    }
}
