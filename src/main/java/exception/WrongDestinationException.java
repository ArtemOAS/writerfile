package exception;

public class WrongDestinationException extends RuntimeException{
    public WrongDestinationException(String message) {
        super(message);
    }
}
