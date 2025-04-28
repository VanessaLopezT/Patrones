package Decorator_Patron;

public class ConcreteDecorator1 extends BaseDecorator {
    public ConcreteDecorator1(Component c) {
        super(c);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    public void extra() {
        System.out.println("ConcreteDecorator1: comportamiento adicional 1");
    }
}
