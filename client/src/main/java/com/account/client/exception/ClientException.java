/**
* Dev space by Mayu... 
**/
package com.account.client.exception;

public class ClientException extends Exception {


	/**
	 * ClientException.java
	 */
	private static final long serialVersionUID = -2668408464919493492L;

	private String errorCode;

	private ErrorMsgLoader errorMsgLoader = new ErrorMsgLoader();

	public ClientException() {
		super();
	}

	public ClientException(String errCode) {
		super();
		this.errorCode = errCode;
	}

	public ClientException(String errCode, Throwable cause) {
		super(cause);
		this.errorCode = errCode;
	}

	public ClientException(String strErrorMsg, String errCode, Throwable cause) {
		super(strErrorMsg, cause);
		this.errorCode = errCode;
	}

	public String getErrorCode() {

		return errorCode;
	}

	public void setErrorCode(String errCode) {

		this.errorCode = errCode;
	}

	public String getLocalizedMessage() {

		if (this.errorCode == null || this.errorCode.isEmpty()) {
			return getMessage();
		}

		return errorMsgLoader.getErrorMessage(errorCode) + getMessage();

	}

}
