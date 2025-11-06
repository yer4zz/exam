//Практика: создать класс Logger в виде Singleton


class Logger {
    private static Logger instance;

    private Logger() {};

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

public class Main11 {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        System.out.println(log);
    }
}