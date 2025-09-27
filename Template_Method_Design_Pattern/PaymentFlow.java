package Template_Method_Design_Pattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculatePlatformFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // This is template method which defines the order of execution of steps to execute the task
    public final void sendMoney(){
        // Step-1
        validateRequest();

        // Step-2
        debitAmount();

        // Step-3
        calculatePlatformFees();

        // Step-4
        creditAmount();
    }
}
