/**
* Dev space by Mayu... 
**/
package com.account.client.exception;

import java.util.ResourceBundle;

public class ErrorMsgLoader {

	private static final String PROP_FILE_NAME = "com.account.client.exception" + ".ErrorMsg";

	private ResourceBundle propertyBundle;

	public String getErrorMessage(String errorKey) {

		getPropertiesBundle();
		if (this.propertyBundle.containsKey(errorKey)) {
			return this.propertyBundle.getString(errorKey);
		}
		return null;
	}

	private ResourceBundle getPropertiesBundle() {

		this.propertyBundle = ResourceBundle.getBundle(PROP_FILE_NAME);
		return propertyBundle;
	}
}
