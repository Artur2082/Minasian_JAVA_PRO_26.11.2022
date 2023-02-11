package P_Working_With_Stream_HT_19;

public class OutOfTypeException extends Exception{
    String message;

    public OutOfTypeException(String message1) {
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
