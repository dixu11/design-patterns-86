package structural.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

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
        System.out.println("Otwieram folder " + name);
        for (Component component : components) {
            component.open();
        }
    }

    @Override
    public Optional<Component> findComponentByName(String nameFragment) {
        //czy ja się tak nazywam?
        if (name.contains(nameFragment)) {
            return Optional.of(this);
        }
        //czy ktoś w środku się tak nazywa?
        for (Component component : components) {
            Optional<Component> innerOptional = component.findComponentByName(nameFragment);
            if (innerOptional.isPresent()) { // czy jest coś w środku?
                return innerOptional; // tak! zwracam
            }
        }
        return Optional.empty(); // nie, pusty
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


    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }
}
