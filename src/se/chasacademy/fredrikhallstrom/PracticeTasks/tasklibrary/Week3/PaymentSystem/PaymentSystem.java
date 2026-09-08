package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem;

import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.PaymentMethod;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.card.CardPayment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.invoice.InvoicePayment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment.swish.SwishPayment;
import se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.TaskTemplate;

public class PaymentSystem implements TaskTemplate  {
    public void start() {
        PaymentMethod[] paymentMethods = new PaymentMethod[]{

                new CardPayment("1221121223"),
                new SwishPayment("0705450010"),
                new InvoicePayment("SE-250000"),
        };

        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.pay(100);
        }

        for (PaymentMethod paymentMethod : paymentMethods) {
            IO.println(paymentMethod);
        }
    }
}
