package kz.almat.behavioral.strategy;

public class CardPayment implements PaymentStrategy {

    public CardPayment() {
    }

    @Override
    public void pay() {
        System.out.println("Asking to insert card...");
        System.out.println("Asking for PIN...");
        System.out.println("Checking PIN...");
        System.out.println("Asking for cash...");
        System.out.println("Checking balance...");
        System.out.println("Withdraw cash...");
    }
}
