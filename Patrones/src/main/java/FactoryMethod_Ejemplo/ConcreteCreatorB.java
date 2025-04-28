package FactoryMethod_Ejemplo;

// 4. Creador concreto B
public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
