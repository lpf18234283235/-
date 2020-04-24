package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class ApplyException extends ServiceException {

	/**
	 *
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public ApplyException() {
		super();
	}

	public ApplyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApplyException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplyException(String message) {
		super(message);
	}

	public ApplyException(Throwable cause) {
		super(cause);
	}

	
}
