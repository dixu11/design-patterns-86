package behavioral.chainOfResponsibility;

public class ErrorLogger extends Logger {

    @Override
    public void log(String message, LogLvl lvl) {
        if (LogLvl.ERROR == lvl) {
            System.err.println("ERROR: " + message.toUpperCase());
        } else {
            nextLogger.log(message, lvl);
        }
    }
}
