package behavioral.chainOfResponsibility;

public class InfoLogger extends Logger {
    @Override
    public void log(String message, LogLvl lvl) {
        if (LogLvl.INFO == lvl) {
            System.out.println("INFO: " + message);
        } else {
            nextLogger.log(message, lvl);
        }
    }
}
