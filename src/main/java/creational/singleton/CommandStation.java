package creational.singleton;

public class CommandStation {

    private static CommandStation instance;
    public static int counter = 0;

    private CommandStation() {
        System.out.println("tworzy się obiekt");
    }

    public static CommandStation getInstance() {
        if (instance == null) {
            instance = new CommandStation();
        }
        return instance;
    }

}
