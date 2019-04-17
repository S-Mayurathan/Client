/**
* Dev space by Mayu... 
**/
package com.account.client.exception;

public class ClientAppException extends ClientException {


	/**
	 * ClientAppException.java
	 */
	private static final long serialVersionUID = 1L;

	public ClientAppException() {

		super();
	}

	public ClientAppException(String strErrorCode) {

		super(strErrorCode);
	}

	public ClientAppException(String strErrorCode, Throwable cause) {

		super(strErrorCode, cause);
	}

	public ClientAppException(String strErrorMsg, String strErrorCode, Throwable cause) {

		super(strErrorMsg, strErrorCode, cause);
	}
}
