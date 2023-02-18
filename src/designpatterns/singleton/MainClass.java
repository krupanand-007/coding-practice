package designpatterns.singleton;

public class MainClass {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();

        logger1.log("Test message 1");

        logger1.log(logger1);
        Logger logger2 = Logger.getInstance();
        logger2.log("Test message 2");
        logger2.log(logger2);


    }
}
