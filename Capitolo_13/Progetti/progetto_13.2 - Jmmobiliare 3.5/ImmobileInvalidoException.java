// nuova eccezione personalizzata ImmobileInvalidoException
package com.jmmobiliare.exception;

public class ImmobileInvalidoException extends Exception {

	private static final long serialVersionUID = 7824550927594623854L;

	public ImmobileInvalidoException(String message) {
		super(message);
	}
}