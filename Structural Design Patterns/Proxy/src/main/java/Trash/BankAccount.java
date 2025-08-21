package Trash;

// Реальный объект: выполняет операции с балансом
class BankAccount implements Account {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Реальный счет: Внесение " + amount + "...");
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Реальный счет: Снятие " + amount + "...");
        this.balance -= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}