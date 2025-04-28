package Decorator_Patron;

public class BaseDecorator implements Component {
    protected Component wrappee;

    public BaseDecorator(Component c) {
        this.wrappee = c;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
