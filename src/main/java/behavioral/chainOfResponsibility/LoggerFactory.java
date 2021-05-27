package behavioral.chainOfResponsibility;

public class LoggerFactory {

    private Logger firstLogger;

    LoggerFactory() {

    }

    public Logger createLogger() {
        ErrorLogger logger = new ErrorLogger();
        WarningLogger warningLogger = new WarningLogger();
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();

        logger.setNextLogger(warningLogger)
                .setNextLogger(infoLogger)
                .setNextLogger(debugLogger);

        return logger;
    }

    public Logger createLimitedLogger(LogLvl lastLoggerLvl) {
        firstLogger = createLogger();
        Logger actualLogger =firstLogger;
        while (actualLogger != null){
            if (actualLogger.getLvl() == lastLoggerLvl) {
                actualLogger.setNextLogger(null);
                return firstLogger;
            }
            actualLogger = actualLogger.getNextLogger();
        }
        return firstLogger;

    }




}
