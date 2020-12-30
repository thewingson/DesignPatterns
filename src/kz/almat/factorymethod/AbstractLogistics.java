package kz.almat.factorymethod;

public abstract class AbstractLogistics {

    public void deliver(){
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();

}
