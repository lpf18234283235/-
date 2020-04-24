package com.test.exception;

/**
 * 修改密码异常
 * @author soft01
 *
 */
public class ScoreOutOfException extends ServiceException {

	/**
	 *
	 */
	private static final long serialVersionUID = 8580917140194657471L;

	public ScoreOutOfException() {
		super();
	}

	public ScoreOutOfException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ScoreOutOfException(String message, Throwable cause) {
		super(message, cause);
	}

	public ScoreOutOfException(String message) {
		super(message);
	}

	public ScoreOutOfException(Throwable cause) {
		super(cause);
	}

	
}
