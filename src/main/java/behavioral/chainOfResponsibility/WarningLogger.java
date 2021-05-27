package behavioral.chainOfResponsibility;

public class WarningLogger extends Logger {
    @Override
    public void log(String message, LogLvl lvl) {
        if (LogLvl.WARNING == lvl) {
            System.err.println("WARNING: " + message);
        } else {
            nextLogger.log(message, lvl);
        }
    }
}
