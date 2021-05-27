package behavioral.chainOfResponsibility;

public class WarningLogger extends Logger {
    public WarningLogger() {
        super(LogLvl.WARNING);
    }

    @Override
    public void log(String message) {
        System.err.println("WARNING: " + message);
    }
}
