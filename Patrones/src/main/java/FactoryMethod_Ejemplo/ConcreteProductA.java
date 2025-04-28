package FactoryMethod_Ejemplo;

// 2. Producto Concreto A
public class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("Soy el Producto A haciendo su trabajo.");
    }
}
