package payment;

public class emiPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean process(int amount) {
        //Process payment using EMI
        return false;
    }


}
