
import java.util.HashMap;

public class BankService {
    HashMap<Long, Account> accounts = new HashMap<>();

    public void createAccount(long  accNo, String name, double balance) {
        Account account = new Account(accNo, name, balance);
        accounts.put(accNo, account);
    }

    public Account getAccount(long accNo) {
        return accounts.get(accNo);
    }
}

