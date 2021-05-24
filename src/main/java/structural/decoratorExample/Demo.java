package structural.decoratorExample;

class Demo {
    public static void main(String[] args) {
        Window window = new SimpleWindow();
        window.display();
        System.out.println("----");
        Window windowWithSlider = new VerticalSliderDecorator(new SimpleWindow());
        windowWithSlider.display();
    }
}
