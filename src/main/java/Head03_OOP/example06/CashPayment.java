package Head03_OOP.example06;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("현금으로 "+ amount + " 달러 결제 완료.");
    }
}
