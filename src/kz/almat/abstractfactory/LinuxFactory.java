package kz.almat.abstractfactory;

public class LinuxFactory extends AbstractFactory {
    @Override
    Button createButton() {
        return new LinuxButton();
    }

    @Override
    Form createForm() {
        return new LinuxForm();
    }
}
