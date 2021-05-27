package behavioral.chainOfResponsibility;

public abstract class Logger {

    Logger nextLogger;

    void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    abstract void log(String message, LogLvl lvl);
}
