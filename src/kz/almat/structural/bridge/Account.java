package kz.almat.structural.bridge;

public abstract class Account {

    protected String holder;
    protected String number;
    protected String pin;

    public Account(String holder, String number, String pin) {
        this.holder = holder;
        this.number = number;
        this.pin = pin;
    }

    abstract public String getFullInfo();
}
