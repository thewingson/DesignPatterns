package kz.almat.behavioral;

public class OnlinePayment implements PaymentStrategy {

    public OnlinePayment() {
    }

    @Override
    public void pay() {
        System.out.println("Logging into system...");
        System.out.println("Approving for operation...");
        System.out.println("Checking balance...");
        System.out.println("Transfer cash...");
    }
}
