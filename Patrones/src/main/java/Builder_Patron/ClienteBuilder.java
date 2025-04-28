package Builder_Patron;

public class ClienteBuilder {
    public static void main(String[] args) {
        // Crear builder y director
        ConcreteBuilder1 builder1 = new ConcreteBuilder1();
        Director director = new Director(builder1);

        // Construir producto simple
        director.make("simple");
        Product1 p1 = builder1.getResult();
        System.out.println("Producto 1 construido: " + p1);

        // Cambiar a builder2
        ConcreteBuilder2 builder2 = new ConcreteBuilder2();
        director.changeBuilder(builder2);
        director.make("completo");
        Product2 p2 = builder2.getResult();
        System.out.println("Producto 2 construido: " + p2);
    }
}
