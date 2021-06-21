package behavioral.memento;


public class MementoDemo {

    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document);
        document.addText("Hello");
        System.out.println(document);
        DocumentMemento memento = document.createMemento();
        document.setColor("BLUE");
        System.out.println(document);
        document.setFontSize(20);
        System.out.println(document);

        System.out.println(memento);
        document.recreateFromMemento(memento);
        System.out.println("Odtworzony do pamiatki:");
        System.out.println(document);
    }

}
