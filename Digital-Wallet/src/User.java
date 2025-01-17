import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userId;
    private final String name;
    private final String pan;
    private List<Wallet> wallets;

    public User(String userId, String name, String pan, List<Wallet> wallets) {
        this.userId = userId;
        this.name = name;
        this.pan = pan;
        this.wallets = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPan() {
        return pan;
    }

    public List<Wallet> getWallets() {
        return wallets;
    }
}
