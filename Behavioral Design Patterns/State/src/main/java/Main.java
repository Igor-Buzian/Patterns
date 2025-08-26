public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("\n--- Первая попытка: отменить до оплаты ---");
        order.cancel();

        System.out.println("\n--- Второй сценарий: успешная доставка ---");
        order = new Order();
        order.process();     // Успешно переходит в ProcessingState
        order.cancel();      // Успешно отменяется

        System.out.println("\n--- Третий сценарий: отмена после отправки ---");
        order = new Order();
        order.process();     // Заказ оплачен
        order.ship();        // Заказ отправлен
        order.cancel();      // Нельзя отменить
        order.deliver();     // Заказ доставлен
    }
}