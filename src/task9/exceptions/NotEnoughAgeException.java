package task9.exceptions;

public class NotEnoughAgeException extends RuntimeException {

    private String message;

    public NotEnoughAgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
