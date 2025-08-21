package Trash;

public class BankProxyDemo {
    public static void main(String[] args) {
        // Используем прокси, а не реальный счет напрямую
        Account userAccount = new SecuredAccountProxy(1000.0);

        System.out.println("Текущий баланс: " + userAccount.getBalance());

        // Попытка снять 300, что разрешено
        System.out.println("\n--- Попытка снять 300 ---");
        userAccount.withdraw(300);
        System.out.println("Новый баланс: " + userAccount.getBalance());

        // Попытка снять 1500, что запрещено
        System.out.println("\n--- Попытка снять 1500 ---");
        userAccount.withdraw(1500);
        System.out.println("Баланс остается прежним: " + userAccount.getBalance());

        // Попытка внести 500
        System.out.println("\n--- Попытка внести 500 ---");
        userAccount.deposit(500);
        System.out.println("Новый баланс: " + userAccount.getBalance());
    }
}