package G_Working_With_IO_HT8;

import java.io.IOException;

public class MainLogger {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("C:\\Users\\Артур\\IdeaProjects\\Java_Pro\\Java_Pro_26.11.2022\\src\\main\\java\\G_Working_With_IO_HT8\\LogFile", LoggingLevel.DEBUG, 1000);
        FileLogger.setUpLogger(fileLoggerConfiguration);
        try {
            FileLogger.myLog(" First log sample \n");
            FileLogger.myLog(" Second log sample \n");
            FileLogger.myLog(" Third log sample \n");
            FileLogger.myLog(" Fourth log sample \n");
        } catch (FileMaxSizeReachedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
