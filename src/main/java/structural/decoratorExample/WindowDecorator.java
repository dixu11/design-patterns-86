package structural.decoratorExample;

abstract class WindowDecorator implements Window {

    Window window;

    WindowDecorator(Window window) {
        this.window = window;
    }

}
