package behavioral.chainOfResponsibility;

public class DebugLogger extends Logger {
    public DebugLogger() {
        super(LogLvl.DEBUG);
    }

    @Override
    public void log(String message) {
        System.out.println("(DEBUG: " + message + ")");
    }
}
