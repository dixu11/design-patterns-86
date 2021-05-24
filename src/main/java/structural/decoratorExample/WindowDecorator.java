package structural.decoratorExample;

abstract class WindowDecorator implements Window {

    SimpleWindow simpleWindow;

    WindowDecorator(SimpleWindow simpleWindow) {
        this.simpleWindow = simpleWindow;
    }

}
