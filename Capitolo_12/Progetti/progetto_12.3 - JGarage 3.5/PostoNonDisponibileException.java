// eccezione personalizzata PostoNonDisponibileException
package com.jgarage.exception;

public class PostoNonDisponibileException extends RuntimeException {
    private static final long serialVersionUID = 204400248503933720L;

    public PostoNonDisponibileException(String message) {
        super(message);
    }
}