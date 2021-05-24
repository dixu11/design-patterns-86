package structural.decoratorExample;

class Demo {
    public static void main(String[] args) {
        Window window = new SimpleWindow();
        window.display();
        System.out.println("----");
        Window windowWithSlider = new VerticalSliderDecorator(new SimpleWindow());
        windowWithSlider.display();
        System.out.println("----");
        Window windowWithHSlider = new HorizontalSliderDecorator(new SimpleWindow());
        windowWithHSlider.display();
        System.out.println("----");
        Window windowWith2Sliders = new VerticalSliderDecorator(
                                       new HorizontalSliderDecorator(new SimpleWindow()));
        windowWith2Sliders.display();
        System.out.println("----");
        WindowBorderDecorator borderWindow =  new WindowBorderDecorator(new SimpleWindow(), "falowana");
        borderWindow.display();
        System.out.println(borderWindow.getType());
    }
}
