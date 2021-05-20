package behavioral.mediator.fan_simulation;

public class Button {

    private Mediator mediator;


    public void push() {
        if (mediator.isFanOn()) {
            mediator.turnFanOff();
        } else {
            mediator.turnFanOn();
        }
    }

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
