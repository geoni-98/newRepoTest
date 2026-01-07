package Head03_OOP.example22;

public enum PaymentMethod {
    CREDIT_CARD("신용 카드"),
    ACCOUNT_TRANSFER("계좌 이체"),
    MOBILE_PAYMENT("모바일 결제");

    private final String displayName;

    PaymentMethod(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static void main(String[] args) {
        for (PaymentMethod method : PaymentMethod.values()) {
            System.out.println(method.name() + " => " + method.getDisplayName());
        }
    }
}
