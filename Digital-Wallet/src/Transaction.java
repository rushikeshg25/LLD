public class Transaction {
    private final String transactionId;
    private final Wallet from;
    private final Wallet to;

    public Transaction(String transactionId, Wallet from, Wallet to) {
        this.transactionId = transactionId;
        this.from = from;
        this.to = to;
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
