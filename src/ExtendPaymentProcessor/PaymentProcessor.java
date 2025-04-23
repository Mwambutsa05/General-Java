package ExtendPaymentProcessor;

public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard(200.0);
        PayPal payPal = new PayPal(100.0, "muhimpunduan@gmail.com");
        Bitcoin bitcoin = new Bitcoin(300.0, "BTC123456");
        ApplePay applePay = new ApplePay(85.0, "Device9");

        processor.processPayment(creditCard);
        processor.processPayment(payPal);
        processor.processPayment(bitcoin);
        processor.processPayment(applePay);
    }


    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing credit card payment for amount: $" + creditCard.getAmount());
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal payment for amount: $" + payPal.getAmount() +
                " with email: " + payPal.getEmail());
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Processing Bitcoin payment with transaction ID: " + bitcoin.getTransactionId() +
                " for amount: $" + bitcoin.getAmount());
    }

    public void processPayment(ApplePay applePay) {
        System.out.println("Processing ApplePay payment for amount: $" + applePay.getAmount() +
                " with device ID: " + applePay.getDeviceId());
    }
}

class CreditCard {
    private double amount;

    public CreditCard(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class PayPal {
    private double amount;
    private String email;

    public PayPal(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }
}

class Bitcoin {
    private double amount;
    private String transactionId;

    public Bitcoin(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }
}

class ApplePay {
    private double amount;
    private String deviceId;

    public ApplePay(double amount, String deviceId) {
        this.amount = amount;
        this.deviceId = deviceId;
    }

    public double getAmount() {
        return amount;
    }

    public String getDeviceId() {
        return deviceId;
    }
}