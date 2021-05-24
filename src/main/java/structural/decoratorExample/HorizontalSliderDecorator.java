package structural.decoratorExample;

class HorizontalSliderDecorator extends WindowDecorator{


    HorizontalSliderDecorator(Window window) {
        super(window);
    }

    @Override
    public void display() {
        window.display();
        System.out.println("Okno zawiera poziomy slider");
    }
}
