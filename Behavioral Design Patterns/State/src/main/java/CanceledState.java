public class CanceledState implements OrderState {
    @Override
    public void processOrder(Order order) {
        System.out.println("❌ Нельзя обработать отменённый заказ.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("❌ Нельзя отправить отменённый заказ.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("❌ Нельзя доставить отменённый заказ.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("⚠️ Заказ уже отменён.");
    }
}