package Decorator_Patron;

public class ConcreteComponent implements Component {
    @Override
    public void execute() {
        System.out.println("Ejecutando operación principal del componente concreto.");
    }
}
