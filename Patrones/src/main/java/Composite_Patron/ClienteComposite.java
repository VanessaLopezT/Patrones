package Composite_Patron;

public class ClienteComposite {
    public static void main(String[] args) {
        // Crear hojas
        Leaf hoja1 = new Leaf("A");
        Leaf hoja2 = new Leaf("B");
        Leaf hoja3 = new Leaf("C");

        // Crear composites
        Composite composite1 = new Composite("X");
        Composite composite2 = new Composite("Y");

        // Construir el árbol
        composite1.add(hoja1);
        composite1.add(hoja2);
        composite2.add(hoja3);
        composite2.add(composite1); // composite2 contiene composite1

        // Ejecutar desde el cliente
        System.out.println("Ejecutando composite2:");
        composite2.execute();
    }
}
