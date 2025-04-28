package FactoryMethod_Ejemplo;

// 2. Producto Concreto B
public class ConcreteProductB implements Product {
    @Override
    public void doStuff() {
        System.out.println("Soy el Producto B haciendo su trabajo.");
    }
}
