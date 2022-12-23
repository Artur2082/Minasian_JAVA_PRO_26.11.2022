package Lesson_7_Home_Task_8;

import java.io.*;
import java.time.LocalDateTime;

public class FileLogger {
    private static FileLoggerConfiguration LoggConfig;
    public static void setUpLogger(FileLoggerConfiguration config) {
        LoggConfig = config;
    }
    public static void myLog(String text) throws IOException {
        if (LoggConfig.getLevel() == LoggingLevel.DEBUG) {
            debug(text);
            info(text);
        } else {
            info(text);
        }
        File file = new File(LoggConfig.getFilePath());
        if (file.length() >= LoggConfig.getLimit())
            throw new FileMaxSizeReachedException("File limit - " + LoggConfig.getLimit() + " ;" + " file current size - " + file.length() + " ; path - " + LoggConfig.getFilePath());
    }
    public static void info(String message) throws IOException {
        FileOutputStream fos = new FileOutputStream(LoggConfig.getFilePath(), true);
        message = LocalDateTime.now() + " : LEVEL " + LoggingLevel.INFO + " :" + message;
        byte[] bytes = message.getBytes();
        fos.write(bytes);
        fos.close();
    }
    public static void debug(String message) throws IOException {
        FileOutputStream fos = new FileOutputStream(LoggConfig.getFilePath(), true);
        message = LocalDateTime.now() + " : LEVEL " + LoggingLevel.DEBUG + " :" + message;
        byte[] bytes = message.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
