public class ProcessingState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("⚠️ Заказ уже обрабатывается.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("➡️ Заказ упакован и отправлен.");
        order.changeState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("❌ Нельзя доставить заказ, который ещё не отправлен.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("✅ Заказ отменён из обработки.");
        order.changeState(new CanceledState());
    }
}