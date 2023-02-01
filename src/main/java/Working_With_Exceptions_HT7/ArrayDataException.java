package Working_With_Exceptions_HT7;

public class ArrayDataException extends RuntimeException {
    String message;

    public ArrayDataException(String message1) {
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

