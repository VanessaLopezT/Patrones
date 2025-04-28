package Composite_Patron;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Hoja " + name + ": Haciendo algo de trabajo.");
    }
}
