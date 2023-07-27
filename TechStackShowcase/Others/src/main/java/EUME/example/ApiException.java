package EUME.example;

public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(String message, IErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ApiException(String message) {
        super(message);
    }
    public ApiException(Throwable cause) {
        super(cause);
    }
    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
