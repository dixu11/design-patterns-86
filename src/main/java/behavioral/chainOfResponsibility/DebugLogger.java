package behavioral.chainOfResponsibility;

public class DebugLogger extends Logger {
    @Override
    public void log(String message, LogLvl lvl) {
        if (LogLvl.DEBUG == lvl) {
            System.out.println("(DEBUG: " + message + ")");
        } else {
            nextLogger.log(message, lvl);
        }
    }
}
