package structural.adapterExample;

class MonitorSamsung implements MonitorHDMI {
    @Override
   public void display(String text) {
        System.out.println(text + " w monitorze HDMI Samsung!");
    }
}
