package se.chasacademy.fredrikhallstrom.PracticeTasks.tasklibrary.Week3.PaymentSystem.payment;

public abstract class Payment {
    protected String methodName;

    public Payment(String methodName) {
        this.methodName = methodName;
    }
}
