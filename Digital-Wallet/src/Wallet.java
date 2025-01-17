import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private final String walletId;
    private final User user;
    private int balance;
    private List<Transaction> transactions;

    public Wallet(String walletId, User user) {
        this.walletId = walletId;
        this.user = user;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public String getWalletId() {
        return walletId;
    }

    public User getUser() {
        return user;
    }

    public int getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
    }

    public int credit(int amount){
        this.balance+=amount;
        return balance;
    }

    public int debit(int amount){
        if(amount>this.balance){
            throw new InsufficentFundsException("Funds Insufficent");
        }
        this.balance-=amount;
        return balance;
    }
}
