package Head03_OOP.example08;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("현금: " + amount + "원 결제 처리.");
    }
}
