package Trash;

// Заместитель: добавляет защиту и проверку данных
class SecuredAccountProxy implements Account {
    private BankAccount realAccount;
    private double balance;

    public SecuredAccountProxy(double initialBalance) {
        // Мы не создаем реальный объект сразу. Он будет создан при необходимости.
        // Зато мы можем сохранить начальный баланс для проверки
        this.balance = initialBalance;
        this.realAccount = null; // Пока что realAccount равен null
    }

    private void ensureRealAccountExists() {
        // Ленивая инициализация: создаем реальный счет только тогда, когда он нужен
        if (realAccount == null) {
            System.out.println("Заместитель: Создаем реальный счет...");
            this.realAccount = new BankAccount(this.balance);
        }
    }

    @Override
    public void deposit(double amount) {
        ensureRealAccountExists();
        if (amount > 0) {
            System.out.println("Заместитель: Проверка суммы для внесения... Одобрено.");
            this.realAccount.deposit(amount);
            this.balance = this.realAccount.getBalance();
        } else {
            System.out.println("Заместитель: Ошибка! Нельзя внести отрицательную сумму.");
        }
    }

    @Override
    public void withdraw(double amount) {
        ensureRealAccountExists();
        // Важная логика: проверяем баланс перед снятием
        if (amount > 0 && this.balance >= amount) {
            System.out.println("Заместитель: Проверка баланса... Достаточно средств.");
            this.realAccount.withdraw(amount);
            this.balance = this.realAccount.getBalance();
        } else {
            System.out.println("Заместитель: Ошибка! Недостаточно средств или неверная сумма.");
        }
    }

    @Override
    public double getBalance() {
        if (realAccount != null) {
            return realAccount.getBalance();
        }
        return this.balance;
    }
}