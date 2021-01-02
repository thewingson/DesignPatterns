package kz.almat.structural.bridge;

public class KaspiBankAccount extends Account {

    private String expDate;

    public KaspiBankAccount(String holder, String number, String pin, String expDate) {
        super(holder, number, pin);
        this.expDate = expDate;
    }

    @Override
    public String getFullInfo(){
        return this.holder + "/" + this.number + "/" + this.pin + "/" + this.expDate;
    }
}
