package task11.exceptions;

public class WrongChoice extends RuntimeException {
    public WrongChoice(String message) {
        super(message);
    }
}
