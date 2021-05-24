package structural.adapterExample;

class VgaToHdmiAdapter implements MonitorHDMI{

    private MonitorDaewoo daewoo;

    VgaToHdmiAdapter(MonitorDaewoo daewoo) {
        this.daewoo = daewoo;
    }

    @Override
    public void display(String text) {
        daewoo.show(text); // przekierowanie działania na oryginalne
    }
}
