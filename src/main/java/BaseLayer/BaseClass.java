package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtilityLayer.PropertiesHelper;

public class BaseClass {

	// protected static WebDriver driver;
	/*
	 * Thread Local used for Non-Synchronised (Multi-thrading) to Synchronised
	 * (single threading)
	 */

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return td.get();
	}

	public static void initialisation() {

		String browsername = PropertiesHelper.getProperty("BROWSER_NAME");

		if (browsername.equals("chrome")) {
			td.set(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		} else if (browsername.equalsIgnoreCase("fireFox")) {
			td.set(new FirefoxDriver());
		} else if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			td.set(new ChromeDriver(opt));
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			td.set(new ChromeDriver(opt));
		} else if (browsername.equalsIgnoreCase("disableNotification")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disableNotification");
			td.set(new ChromeDriver(opt));
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	// for TestNG
	public static void initialisation(String browsername) {

		if (browsername.equals("chrome")) {
			td.set(new ChromeDriver());
		} else if (browsername.equalsIgnoreCase("edge")) {
			td.set(new EdgeDriver());
		} else if (browsername.equalsIgnoreCase("fireFox")) {
			td.set(new FirefoxDriver());
		} else if (browsername.equalsIgnoreCase("headless")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--headless");
			td.set(new ChromeDriver(opt));
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			td.set(new ChromeDriver(opt));
		} else if (browsername.equalsIgnoreCase("disableNotification")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disableNotification");
			td.set(new ChromeDriver(opt));
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public static void getURL() {
		String url = PropertiesHelper.getProperty("SIT_URL");
		getDriver().get(url);
	}

	public static void tearDown() throws InterruptedException {
		if (getDriver() != null) {

			Thread.sleep(5000);
			getDriver().quit();
		}
	}

}
