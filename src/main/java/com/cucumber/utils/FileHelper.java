package com.cucumber.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class FileHelper {

	public static String getResourcePath(String path) {
		String basePath = System.getProperty("user.dir");
		System.out.println(basePath + "/" + path);
		return basePath + "/" + path;
	}

	public Properties getProperty() {
		FileInputStream fileInputStream = null;
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/main/java/com/cucumber/config/config.properties"));
		} catch (Exception e) {
			System.out.println("Exception :" + e);
		}
		return properties;

	}

}
