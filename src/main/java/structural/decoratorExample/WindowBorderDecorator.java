package structural.decoratorExample;

class WindowBorderDecorator extends WindowDecorator{
    private String type;

    WindowBorderDecorator(Window window, String type) {
        super(window);
        this.type = type;
    }

    @Override
    public void display() {
        window.display();
        System.out.println("Z ramką typu " + type);
    }

    String getType() {
        return type;
    }
}
