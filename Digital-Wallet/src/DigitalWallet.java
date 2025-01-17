import java.util.HashMap;
import java.util.Map;

public class DigitalWallet {
    private static DigitalWallet instance;
    private final Map<String, User> users;
    private final Map<String, Wallet> accounts;

    private DigitalWallet(){
        this.users=new HashMap<>();
        this.accounts=new HashMap<>();
    }

    public static synchronized DigitalWallet getInstance(){
        if(instance==null){
            return new DigitalWallet();
        }
        return instance;
    }
}
