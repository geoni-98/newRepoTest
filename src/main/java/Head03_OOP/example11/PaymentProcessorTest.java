package Head03_OOP.example11;


public class PaymentProcessorTest {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        Payment[] payment = new Payment[] {
                new CreditCardPayment(),
                new AccountTransferPayment(),
                new MobilePayment()
        };
        double[] amount = new double[] {
                10000,
                20000,
                50000
        };
        int index = 0;
        for (Payment pay : payment) {
            paymentProcessor.pay(pay, amount[index++]);
        }
    }
}
