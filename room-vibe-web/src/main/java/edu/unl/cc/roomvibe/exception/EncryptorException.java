package edu.unl.cc.roomvibe.exception;

public class EncryptorException extends Exception{

    public EncryptorException() {
        super("Problemas al encriptar/desencriptar");
    }

    public EncryptorException(String message) {
        super(message);
    }

    public EncryptorException(String message, Throwable cause) {
        super(message, cause);
    }
}
