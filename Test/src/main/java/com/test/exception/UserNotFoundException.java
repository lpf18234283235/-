package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class UserNotFoundException extends ServiceException {

	/**
	 *
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}

	
}
