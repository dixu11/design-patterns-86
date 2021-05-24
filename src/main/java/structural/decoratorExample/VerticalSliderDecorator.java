package structural.decoratorExample;

class VerticalSliderDecorator extends WindowDecorator{


    VerticalSliderDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        window.display();
        System.out.println("Okno zawiera pionowy slider");
    }
}
