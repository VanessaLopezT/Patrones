package Composite_Patron;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void execute() {
        System.out.println("Composite " + name + ": Delegando el trabajo a los hijos...");
        for (Component child : children) {
            child.execute();
        }
    }
}
