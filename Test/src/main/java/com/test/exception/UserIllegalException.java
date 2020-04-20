package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class UserIllegalException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public UserIllegalException() {
		super();
	}

	public UserIllegalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserIllegalException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserIllegalException(String message) {
		super(message);
	}

	public UserIllegalException(Throwable cause) {
		super(cause);
	}

	
}
