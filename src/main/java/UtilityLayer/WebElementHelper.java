package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class WebElementHelper extends BaseClass {

	public static void click(WebElement wb) {

		if (wb.isDisplayed() && (wb.isEnabled())) {
			WaitsHelper.visibilityOf(wb).click();
		}
	}

	public static void sendKeys(WebElement wb, String value) {

		if (wb.isDisplayed() && (wb.isEnabled())) {

			WebElementHelper.clear(wb);// it will clear textbox before sendKeys method
			WaitsHelper.visibilityOf(wb).sendKeys(value);
		}
	}

	public static void clear(WebElement wb) {
		if (wb.isDisplayed() && (wb.isEnabled())) {
			WaitsHelper.visibilityOf(wb).clear();
		}
	}

	public static String getText(WebElement wb) {
		if (wb.isDisplayed() && (wb.isEnabled())) {
			return WaitsHelper.visibilityOf(wb).getText();
		}
		return null;
	}

}
