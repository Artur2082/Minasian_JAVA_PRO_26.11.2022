package Lesson_6_Home_Task_7;

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
