package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class StatusNotAllowException extends ServiceException {

	/**
	 *
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public StatusNotAllowException() {
		super();
	}

	public StatusNotAllowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StatusNotAllowException(String message, Throwable cause) {
		super(message, cause);
	}

	public StatusNotAllowException(String message) {
		super(message);
	}

	public StatusNotAllowException(Throwable cause) {
		super(cause);
	}

	
}
