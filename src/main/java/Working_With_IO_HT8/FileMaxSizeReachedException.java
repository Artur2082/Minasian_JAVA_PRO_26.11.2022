package Working_With_IO_HT8;

public class FileMaxSizeReachedException extends RuntimeException {
    String message;

    public FileMaxSizeReachedException(String message1) {
        this.message = message1;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
