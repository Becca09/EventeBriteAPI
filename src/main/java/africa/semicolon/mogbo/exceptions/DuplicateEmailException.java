package africa.semicolon.mogbo.exceptions;

public class DuplicateEmailException extends africa.semicolon.eventBrite.exceptions.EventBriteException {

    public DuplicateEmailException(String message) {
        super(message);
    }
}
