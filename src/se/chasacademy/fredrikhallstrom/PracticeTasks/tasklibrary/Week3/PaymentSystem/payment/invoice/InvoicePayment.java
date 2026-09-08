package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.invoice;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.Payment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.PaymentMethod;

public class InvoicePayment extends Payment implements PaymentMethod {
    private String invoiceNumber;

    public InvoicePayment(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        super("Faktura");
    }

    @Override
    public void pay(double amount) {
        IO.println(String.format("Betalning med %s. Debiterat %.1f SEK", methodName, amount));
    }

    @Override
    public String toString() {
        return String.format("%sbetalning med faktura %s", methodName, invoiceNumber);
    }
}
