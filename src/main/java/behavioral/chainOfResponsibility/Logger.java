package behavioral.chainOfResponsibility;

public abstract class Logger {

  private   Logger nextLogger;
    private LogLvl lvl;

   public Logger(LogLvl lvl) {
        this.lvl = lvl;
    }

    Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    //template method pattern
    void log(String message, LogLvl msgLvl){
        if (lvl == msgLvl) {
          log(message);
        } else if(nextLogger!= null){
            nextLogger.log(message, msgLvl);
        }
    }

    abstract void log(String message);

    LogLvl getLvl() {
        return lvl;
    }

   public Logger getNextLogger() {
        return nextLogger;
    }
}
