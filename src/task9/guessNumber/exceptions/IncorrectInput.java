package task9.guessNumber.exceptions;

public class IncorrectInput extends RuntimeException{

    public IncorrectInput(String message) {
        super(message);
    }
}
