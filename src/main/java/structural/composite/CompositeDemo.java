package structural.composite;

import java.util.Optional;

public class CompositeDemo {
    public static void main(String[] args) {
        Component file = new File("zadanie.txt");
//        file.open();
//        file.rename("java.txt");
//        file.open();
        Component file2 = new File("pylek.jpg");
        Component file3 = new File("tetris.exe");
        Folder mainFolder = new Folder("glowny");
        Folder innerFolder = new Folder("wSrodkuFolder");

        mainFolder.add(file);
        mainFolder.add(innerFolder);
        innerFolder.add(file2);
        innerFolder.add(file3);

        mainFolder.open();

      Optional<Component> result1 = file.findComponentByName("zad"); // znajdzie
      Optional<Component> result2 =  mainFolder.findComponentByName("tetris");//znajdzie
        Optional<Component> result3 = mainFolder.findComponentByName("foo"); // nie znajdzie
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
