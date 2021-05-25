package structural.composite;

import java.util.Optional;

public class File implements Component{

    private String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void rename(String name) {
        System.out.println("Nowa nazwa pliku " + this.name + " to " + name);
        this.name = name;
    }

    @Override
    public void open() {
        System.out.println("Otwieram plik " + name);
    }

    @Override
    public Optional<Component> findComponentByName(String nameFragment) {
        if (name.contains(nameFragment)) {
            // optional z tym obiektem
            return Optional.of(this);
        }
        // pusty potional
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
