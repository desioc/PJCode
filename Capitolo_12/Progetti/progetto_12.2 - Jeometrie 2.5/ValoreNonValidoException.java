// eccezione personalizzata ValoreNonValidoException
package com.jeometria;

public class ValoreNonValidoException extends RuntimeException {
	private static final long serialVersionUID = -9079450207092806234L;

	public ValoreNonValidoException(String message) {
		super(message);
	}
}