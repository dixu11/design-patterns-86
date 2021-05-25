package structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Component file = new File("zadanie.txt");
//        file.open();
//        file.rename("java.txt");
//        file.open();
        Component file2 = new File("pylek.jpg");
        Component file3 = new File("tetris.exe");
        Component mainFolder = new Folder("glowny");
        Component innerFolder = new Folder("wSrodkuFolder");


    }
}
