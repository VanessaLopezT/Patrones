package Decorator_Patron;

public class ConcreteDecorator2 extends BaseDecorator {
    public ConcreteDecorator2(Component c) {
        super(c);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    public void extra() {
        System.out.println("ConcreteDecorator2: comportamiento adicional 2");
    }
}
