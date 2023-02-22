package task9.exceptions;

public class NameEmptyException extends RuntimeException {

    private String message;

    public NameEmptyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
