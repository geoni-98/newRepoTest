package Head03_OOP.example03;

public class TestProgram {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getOrderId());
        System.out.println(order.isPaid(false));

        order.setOrderId("김김김");
        order.isPaid(false);

        System.out.println(order.getOrderId());
        System.out.println(order.isPaid(false));
    }
}
