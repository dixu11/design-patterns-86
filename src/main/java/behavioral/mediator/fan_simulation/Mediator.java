package behavioral.mediator.fan_simulation;

class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupplier supplier;

    Mediator(Button button, Fan fan, PowerSupplier supplier) {
        this.button = button;
        this.fan = fan;
        this.supplier = supplier;
    }

    boolean isFanOn() {
       return fan.isOn();
    }

    void turnFanOff() {
        fan.turnOff();
    }

    void turnFanOn() {
        fan.turnOn();
    }

    void stopSupplier() {
        supplier.stop();
    }

    void startSupplier() {
        supplier.start();
    }
}
