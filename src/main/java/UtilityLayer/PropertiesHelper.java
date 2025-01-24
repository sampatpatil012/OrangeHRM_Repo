package UtilityLayer;

import java.io.FileInputStream;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertiesHelper extends BaseClass {

	protected static Properties prop;

	public static String getProperty(String keyName) {

		prop = new Properties();

		String configPath = System.getProperty("user.dir")+"/src/main/java/configurationLayer/config.properties";

		try {
			FileInputStream fis = new FileInputStream(configPath);
			prop.load(fis);
			return prop.getProperty(keyName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
