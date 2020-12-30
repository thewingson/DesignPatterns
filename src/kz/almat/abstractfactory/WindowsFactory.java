package kz.almat.abstractfactory;

public class WindowsFactory extends AbstractFactory {
    @Override
    Button createButton() {
        return new WindowsButton();
    }

    @Override
    Form createForm() {
        return new WindowsForm();
    }
}
