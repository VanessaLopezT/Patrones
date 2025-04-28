package FactoryMethod_Ejemplo;

// 3. Creador abstracto
public abstract class Creator {
    public void someOperation() {
        Product p = createProduct();
        p.doStuff();
    }
    public abstract Product createProduct();
}
