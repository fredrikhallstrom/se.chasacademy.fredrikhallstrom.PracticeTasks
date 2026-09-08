package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.swish;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.Payment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.PaymentMethod;

public class SwishPayment extends Payment implements PaymentMethod {
    private String phoneNumber;

    public SwishPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        super("Swish");
    }

    @Override
    public void pay(double amount) {
        IO.println(String.format("Betalning med %s. Swishat %.1f SEK", methodName, amount));
    }

    @Override
    public String toString() {
        return String.format("%sbetalning till %s", methodName, phoneNumber);
    }
}
