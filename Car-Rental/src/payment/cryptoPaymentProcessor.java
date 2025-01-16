package payment;

public class cryptoPaymentProcessor implements PaymentProcessor{
    @Override
    public boolean process(int amount){
        //process crypto payment
        return true;
    }
}
