public class Main {
    public static void main(String[] args) {
        IAccount account = new BankProxyDemo(1000);
        account.takeMoney(300);
        System.out.println("1: "+account.getBalance());
        account.takeMoney(1200);
        System.out.println("2: "+account.getBalance());
        account.giveMoney(300);
        System.out.println("3: "+account.getBalance());
    }
}
