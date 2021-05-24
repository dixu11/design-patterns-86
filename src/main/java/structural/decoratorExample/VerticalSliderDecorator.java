package structural.decoratorExample;

class VerticalSliderDecorator extends WindowDecorator{

    VerticalSliderDecorator(SimpleWindow simpleWindow) {
        super(simpleWindow);
    }

    @Override
    public void display() {
        simpleWindow.display();
        System.out.println("Okno zawiera pionowy slider");
    }
}
