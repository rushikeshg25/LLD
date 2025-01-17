import java.time.LocalDateTime;

public class Transaction {
    private final String transactionId;
    private final Wallet from;
    private final Wallet to;
    private final LocalDateTime timeStamp;

    public Transaction(String transactionId, Wallet from, Wallet to) {
        this.transactionId = transactionId;
        this.from = from;
        this.to = to;
        this.timeStamp=LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Wallet getFrom() {
        return from;
    }

    public Wallet getTo() {
        return to;
    }
}
