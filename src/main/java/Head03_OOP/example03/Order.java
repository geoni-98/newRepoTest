package Head03_OOP.example03;

public class Order {
    private String orderId;
    private boolean isPaid;

    public Order() {
        this.orderId = "NONE";
        this.isPaid = isPaid;
    }

    public Order(String orderId, boolean isPaid) {
        this.orderId = orderId;
        this.isPaid = isPaid;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public boolean isPaid(boolean b) {
        return this.isPaid;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
