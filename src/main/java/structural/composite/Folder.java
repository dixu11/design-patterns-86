package structural.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Folder implements Component{

    private String name;
    private Collection<Component> components = new ArrayList<>();

    Folder(String name) {
        this.name = name;
    }

    @Override
    public void rename(String name) {
        System.out.println("Nowa nazwa folderu " + this.name + " to " + name);
        this.name = name;
    }

    @Override
    public void open() {

    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Collection<Component> getChildren() {
        return components;
    }
}
