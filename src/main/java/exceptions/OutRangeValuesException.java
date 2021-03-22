package exceptions;

public class OutRangeValuesException extends Throwable {
    @Override
    public String getMessage() {
        return "Can't exceed the maximum range  to withdraw";
    }
}
