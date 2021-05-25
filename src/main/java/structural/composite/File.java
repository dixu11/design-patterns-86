package structural.composite;

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
}
