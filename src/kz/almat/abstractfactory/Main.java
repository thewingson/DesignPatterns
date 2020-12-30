package kz.almat.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new WindowsFactory();
        Application application = new Application(factory);
        application.draw();

        factory = new LinuxFactory();
        application = new Application(factory);
        application.draw();
    }

}
