package net.neoremind.navi.exception;

public class InvalidProtocolException extends RuntimeException {

	private static final long serialVersionUID = -6138595796119511714L;

	public InvalidProtocolException() {
	}

	public InvalidProtocolException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidProtocolException(String message) {
		super(message);
	}

	public InvalidProtocolException(Throwable cause) {
		super(cause);
	}

}
