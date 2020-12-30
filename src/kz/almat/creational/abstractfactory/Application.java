package kz.almat.creational.abstractfactory;

public class Application {

    private Button button;
    private Form form;

    public Application(AbstractFactory factory) {
        this.button = factory.createButton();
        this.form = factory.createForm();
    }

    public void draw(){
        button.draw();
        form.draw();
    }
}
