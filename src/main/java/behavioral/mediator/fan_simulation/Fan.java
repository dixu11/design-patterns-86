package behavioral.mediator.fan_simulation;

public class Fan {

    private Mediator mediator;
    private boolean on;


    public void turnOn() {
        mediator.startSupplier();
        on = true;
    }

    public void turnOff() {
        mediator.stopSupplier();
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
