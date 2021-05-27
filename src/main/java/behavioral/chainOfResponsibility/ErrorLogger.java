package behavioral.chainOfResponsibility;

public class ErrorLogger extends Logger {

    public ErrorLogger() {
        super(LogLvl.ERROR);
    }

    @Override
    public void log(String message) {
        System.err.println("ERROR: " + message.toUpperCase());
    }
}
