package day40_exceptions.bank;

public class InvalidCredentialException extends Exception {

    public  InvalidCredentialException (String msg) {
        super(msg);
    }

}