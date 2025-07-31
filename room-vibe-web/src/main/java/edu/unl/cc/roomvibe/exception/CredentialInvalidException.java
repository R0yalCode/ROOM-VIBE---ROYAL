package edu.unl.cc.roomvibe.exception;

public class CredentialInvalidException extends Exception{

    public CredentialInvalidException() {
        super("Credenciales invalidas");
    }

    public CredentialInvalidException(String message) {
        super(message);
    }
}
