package entities.enums;

public enum ex7_2_5 {

    PENDING_PAYMENT(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4);

    private final int code;

    ex7_2_5(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
