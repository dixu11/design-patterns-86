package structural.adapterExample;

class Laptop {

    private MonitorHDMI monitor;

    Laptop(MonitorHDMI monitor) {
        this.monitor = monitor;
    }

    public void display() {
        System.out.println("Wyświetlam na ekranie:");
        monitor.display("Hello Wordl!");
    }
}

class Demo{
    public static void main(String[] args) {
       MonitorHDMI daewooAdapter =new VgaToHdmiAdapter(new MonitorDaewoo());
        MonitorSamsung monitorSamsung = new MonitorSamsung();

//        Laptop laptop = new Laptop(monitorHdmi);

        Laptop laptop = new Laptop(daewooAdapter);
        laptop.display();
    }
}
