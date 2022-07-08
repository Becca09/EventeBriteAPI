package africa.semicolon.mogbo.exceptions;

public class UserDoesNotExistException extends africa.semicolon.eventBrite.exceptions.EventBriteException {

    public UserDoesNotExistException(String message) {
        super(message);
    }
}
