package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitsHelper extends BaseClass {

//	public static WebElement visibilityOf1(WebElement wb) {
//		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
//		return wait.until(ExpectedConditions.visibilityOf(wb));
//	}

	public static WebElement visibilityOf(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}

	public static Alert alertIsPresent() {

		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

}
