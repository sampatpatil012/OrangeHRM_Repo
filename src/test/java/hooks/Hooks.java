package hooks;

import BaseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseClass {

	@BeforeAll
	public static void setUp() {
		BaseClass.initialisation();
		BaseClass.getURL();
	}

	@After
	public static void refresh() {
		getDriver().navigate().refresh();
	}

}
