package UtilityLayer;

import BaseLayer.BaseClass;

public class AlertHelper extends BaseClass {

	/*
	 * click switch to focus 4 methods.. accept() dismiss() sendKeys() getText()
	 */
	

	public static void accept() {
		WaitsHelper.alertIsPresent().accept();
	}

	public static void dismiss() {
		WaitsHelper.alertIsPresent().dismiss();
	}

	public static String getText() {
		return WaitsHelper.alertIsPresent().getText();
	}

	public static void sendKeys(String value) {
		WaitsHelper.alertIsPresent().sendKeys(value);
	}

}
