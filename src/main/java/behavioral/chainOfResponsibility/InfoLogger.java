package behavioral.chainOfResponsibility;

public class InfoLogger extends Logger {
    public InfoLogger() {
        super(LogLvl.INFO);
    }

    @Override
    public void log(String message) {
        System.out.println("INFO: " + message);
    }
}
