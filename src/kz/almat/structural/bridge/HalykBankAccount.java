package kz.almat.structural.bridge;

public class HalykBankAccount extends Account {

    private String code;

    public HalykBankAccount(String holder, String number, String pin, String code) {
        super(holder, number, pin);
        this.code = code;
    }

    @Override
    public String getFullInfo() {
        return this.holder + "/" + this.number + "/" + this.pin + "/" + this.code;
    }
}
