package EUME.example;

/**
 * A popular template of enmu
 * 1. Interface A -> getCode, getMessage
 * 2. enum B implements the interface A
 * 3. private enum constructor
 * 4. An exception can aggregate the interface/enum
 */
public interface IErrorCode {
    Long getCode();
    String getMessage();
}
