package Head03_OOP.example08;


public class PolymorphismTest {
    public static void main(String[] args) {
        Payment[] payments = new Payment[]{
                new AccountTransferPayment(),
                new CreditCardPayment(),
                new CashPayment()
        };
        OrderService service = new OrderService();
        double[] paymentAmounts = new double[] {
                30000,
                70000,
                50000
        };
        for(Payment p : payments) {
            if (p instanceof CreditCardPayment){
                service.processPayment(p,paymentAmounts[0]);
            } else if(p instanceof AccountTransferPayment) {
                service.processPayment(p,paymentAmounts[1]);
            } else if(p instanceof CashPayment) {
                service.processPayment(p,paymentAmounts[2]);
            } else {
                service.processPayment(p,1000);
            }
        }
    }
}
