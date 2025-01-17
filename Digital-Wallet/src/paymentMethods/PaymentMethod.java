package paymentMethods;

public interface PaymentMethod {
     void debit(int amount,String from,String to);
    void credit(int amount,String from,String to);
}
