package Trash;

// Общий интерфейс для счета
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}