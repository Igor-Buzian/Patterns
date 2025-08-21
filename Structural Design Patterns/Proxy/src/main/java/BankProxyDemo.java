public class BankProxyDemo implements IAccount {
    private double balance;
    private BackAccount account;


    public BankProxyDemo(double balance) {
        this.balance = balance;
        this.account = null;
    }

    // Lazy initialization of the real account object
    // This is the core of the lazy loading proxy
    private void initialAccount() {
        if (account == null) {
            System.out.println("Proxy: Creating a new real account object.");
            account = new BackAccount(balance);
        }
    }


    @Override
    public void takeMoney(double amount) {
        initialAccount();
        if (amount > 0 && amount <= balance) {
            System.out.println("Proxy: Checking balance... Sufficient funds.");
            account.takeMoney(amount);
            balance = account.getBalance();
        } else {
            System.out.println("Proxy: Error! Cannot withdraw a negative amount or an amount greater than the balance.");
        }
    }

    @Override
    public void giveMoney(double amount) {
        initialAccount();
        if (amount > 0) {
            System.out.println("Proxy: Checking the amount to be deposited... Approved!");
            account.giveMoney(amount);
            balance = account.getBalance();
        } else {
            System.out.println("Proxy: Error! Cannot deposit a negative amount.");
        }
    }

    @Override
    public double getBalance() {
        if (account != null)
            return account.getBalance();
        return balance;
    }
}