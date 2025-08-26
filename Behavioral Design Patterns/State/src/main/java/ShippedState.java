public class ShippedState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("⚠️ Заказ уже был обработан и отправлен.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("⚠️ Заказ уже в пути.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("➡️ Заказ доставлен клиенту. Поздравляем!");
        order.changeState(new DeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("❌ Нельзя отменить заказ, который уже отправлен.");
    }
}