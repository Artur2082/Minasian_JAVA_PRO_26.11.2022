package S_Reflection_and_Annotations_HT_26;

public class TestException extends Exception {
    String message;

    public TestException(String message1) {
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
