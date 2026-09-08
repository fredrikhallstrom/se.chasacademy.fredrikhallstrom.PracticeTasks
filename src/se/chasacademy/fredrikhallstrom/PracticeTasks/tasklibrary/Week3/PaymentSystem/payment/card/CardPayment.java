package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.card;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.Payment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.PaymentMethod;

public class CardPayment extends Payment implements PaymentMethod {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        super("Kort");
    }

    @Override
    public void pay(double amount) {
        IO.println(String.format("Betalning med %s. Debiterat %.1f SEK", methodName, amount));
    }

    @Override
    public String toString() {
        return String.format("%sbetalning med kort %s", methodName, cardNumber);
    }
}
