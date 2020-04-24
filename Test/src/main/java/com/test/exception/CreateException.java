package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class CreateException extends ServiceException {

	/**
	 *
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public CreateException() {
		super();
	}

	public CreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CreateException(String message, Throwable cause) {
		super(message, cause);
	}

	public CreateException(String message) {
		super(message);
	}

	public CreateException(Throwable cause) {
		super(cause);
	}

	
}
