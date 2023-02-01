package Working_With_Exceptions_HT7;

public class ArraySizeException extends RuntimeException {
    String message;

    public ArraySizeException(String message1) {
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
