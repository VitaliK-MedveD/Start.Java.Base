package task9.exceptions;

public class NotEnoughCashException extends RuntimeException {

    private String message;

    public NotEnoughCashException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
