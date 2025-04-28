package FactoryMethod_Ejemplo;

// 4. Creador concreto A
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
