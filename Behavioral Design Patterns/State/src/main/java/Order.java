import java.util.UUID;

public class Order {
    private final String orderId;
    private OrderState currentState;

    public Order() {
        this.orderId = UUID.randomUUID().toString().substring(0, 8);
        // Начальное состояние
        this.currentState = new PendingPaymentState();
        System.out.println("Создан новый заказ с ID: " + this.orderId);
        System.out.println("Текущее состояние: " + currentState.getClass().getSimpleName());
    }

    // Метод для смены состояния
    public void changeState(OrderState newState) {
        this.currentState = newState;
        System.out.println("Состояние заказа с ID " + this.orderId + " изменено на: " + newState.getClass().getSimpleName());
    }

    public void process() {
        currentState.processOrder(this);
    }

    public void ship() {
        currentState.shipOrder(this);
    }

    public void deliver() {
        currentState.deliverOrder(this);
    }

    public void cancel() {
        currentState.cancelOrder(this);
    }

    public String getOrderId() {
        return orderId;
    }
}