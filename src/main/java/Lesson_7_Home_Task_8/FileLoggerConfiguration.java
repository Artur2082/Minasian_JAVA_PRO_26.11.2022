package Lesson_7_Home_Task_8;

import java.util.logging.Formatter;
import java.util.logging.SimpleFormatter;

public class FileLoggerConfiguration {
    private final String filePath;
    private final LoggingLevel level;
    private final int limit;
    private final Formatter formatter;

    public FileLoggerConfiguration(String filePath, LoggingLevel level, int limit) {
        this.filePath = filePath;
        this.level = level;
        this.limit = limit;
        this.formatter = new SimpleFormatter();
    }
    public String getFilePath() {
        return filePath;
    }
    public LoggingLevel getLevel() {
        return level;
    }
    public int getLimit() {
        return limit;
    }
}

