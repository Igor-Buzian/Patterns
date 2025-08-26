public class PendingPaymentState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("➡️ Заказ оплачен. Переход к обработке.");
        order.changeState(new ProcessingState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("❌ Нельзя отправить неоплаченный заказ.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("❌ Нельзя доставить неоплаченный заказ.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("✅ Заказ отменён.");
        order.changeState(new CanceledState());
    }
}