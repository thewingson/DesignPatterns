package kz.almat.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Account account = new KaspiBankAccount("Federico", "4404", "1234", "2021");
        Account account2 = new HalykBankAccount("Ciesa", "3231", "1010", "555");

        AccountProcessor.process(account);
        AccountProcessor.process(account2);
    }

}
