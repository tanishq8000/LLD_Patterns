package Template_Method_Design_Pattern;

public class PayToMerchantFlow extends PaymentFlow{
    @Override
    public void validateRequest(){
        System.out.println("Validating Request for Pay to Merchant Payment");
    }

    @Override
    public void debitAmount(){
        System.out.println("Amount debited from sender's account");
    }

    @Override
    public void calculatePlatformFees(){
        System.out.println("Calculating platform fees for pay to Merchant payment");
    }

    @Override
    public void creditAmount(){
        System.out.println("Amount is credited to Merchant's bank account");
    }
}
