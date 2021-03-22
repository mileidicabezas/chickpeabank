package exceptions;

public class InsufficientValuesException extends Throwable {
    @Override
    public String getMessage() {
        return "values equal to zero are not allowed";
    }
}
