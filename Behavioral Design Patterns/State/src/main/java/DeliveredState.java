public class DeliveredState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("⚠️ Заказ уже доставлен.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("⚠️ Заказ уже доставлен.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("⚠️ Заказ уже доставлен.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("❌ Нельзя отменить заказ, который уже доставлен.");
    }
}