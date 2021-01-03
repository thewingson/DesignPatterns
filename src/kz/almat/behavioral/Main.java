package kz.almat.behavioral;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new PaymentService(new CardPayment());
        service.processPay();

        System.out.println();
        service = new PaymentService(new OnlinePayment());
        service.processPay();
    }

}
