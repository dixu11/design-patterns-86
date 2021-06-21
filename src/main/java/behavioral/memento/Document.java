package behavioral.memento;

public class Document {

    private String content;
    private double fontSize;
    private String color;


    public Document() {
        content = "";
        fontSize = 12;
        color = "BLACK";
    }


    public void addText(String text) {
        content += text;
    }

    public void setFontSize(double fontSize) {
        if (fontSize <= 0 || fontSize > 1000) {
            throw new IllegalStateException("Nie można ustawić takiej wartości jako fontSize: " + fontSize);
        }
        this.fontSize = fontSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DocumentMemento createMemento(){
        return new DocumentMemento(content, fontSize, color);
    }

    public void recreateFromMemento(DocumentMemento memento) {
        content = memento.getContent();
        color = memento.getColor();
        fontSize = memento.getFontSize();
    }




    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontSize=" + fontSize +
                ", color='" + color + '\'' +
                '}';
    }
}
