public class BackAccount implements IAccount{
    private double balance;

    public BackAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void takeMoney(double amount) {
        System.out.printf("We take %s from your balance \n",amount);
        balance-=amount;
    }

    @Override
    public void giveMoney(double amount) {
        System.out.printf("We give %s from your balance \n",amount);
        balance+=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
