package designpatterns.singleton;

import java.util.List;


public class Logger {

    private String name;

    private List<LogLevel> levels;

    private static Logger logger;

    private Logger() {

    }

    public void log(Object message) {
        System.out.println(message);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
