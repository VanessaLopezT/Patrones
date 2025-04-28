package Decorator_Patron;

public class ClienteDecorator {
    public static void main(String[] args) {
        // Crear el componente base
        Component a = new ConcreteComponent();
        // Decorar con ConcreteDecorator1
        Component b = new ConcreteDecorator1(a);
        // Decorar con ConcreteDecorator2
        Component c = new ConcreteDecorator2(b);
        // Ejecutar la cadena de decoradores
        c.execute();
    }
}
