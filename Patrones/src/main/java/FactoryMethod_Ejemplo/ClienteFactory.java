package FactoryMethod_Ejemplo;

public class ClienteFactory {
    public static void main(String[] args) {
        Creator creadorA = new ConcreteCreatorA();
        Creator creadorB = new ConcreteCreatorB();

        System.out.println("Probando ConcreteCreatorA:");
        creadorA.someOperation();

        System.out.println("Probando ConcreteCreatorB:");
        creadorB.someOperation();
    }
}
