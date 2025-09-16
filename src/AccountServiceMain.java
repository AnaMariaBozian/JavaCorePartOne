interface AccountService {
    Account findAccountByOwnerId(long id);
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService{

    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts){
            if (account.getId() == id){
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account account : accounts){
            if (account.getBalance() > value){
                count++;
            }
        }
        return count;
    }
}

class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public User getOwner() {
        return owner;
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class AccountServiceMain {
    public static void main(String[] args) {
        User user1 = new User(1, "Ana", "Bozian");
        User user2 = new User(2, "Victor", "Rusu");

        Account acc1 = new Account(1, 2500, user1);
        Account acc2 = new Account(1,3456, user1);
        Account acc3 = new Account(2, 100000, user2);

        Account[] accounts = {acc1, acc2, acc3};
        AccountService service = new AccountServiceImpl(accounts);

        Account lostAcc = service.findAccountByOwnerId(2L);
        if (lostAcc != null) {
            System.out.println("Account found: ID = " + lostAcc.getId() + ", Balance = " + lostAcc.getBalance() + ", Owner = " + lostAcc.getOwner().getFirstName());
        } else {
            System.out.println("No account found");
        }

        long count = service.countAccountsWithBalanceGreaterThan(3000);
        System.out.println(count);
    }
}
