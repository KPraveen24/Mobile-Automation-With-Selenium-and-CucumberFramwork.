package dataProviders;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import Constants.GlobalConstants;

public class ConfigFileReader {

	protected InputStream input = null;
	protected static Properties properties = null;

	public ConfigFileReader() {
		try {
			input = Files.newInputStream(Paths.get(GlobalConstants.Config_Properties_Loc));
			properties = new Properties();
			properties.load(input);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getScreenrecord() {
		return properties.getProperty("Screenrecord");
	}

	public static String getScreenRecordPath() {
		return properties.getProperty("ScreenRecordPath");
	}

	public static String getPLATFORM_VERSION() {
		return properties.getProperty("PLATFORM_VERSION");
	}

	public static String getDEVICE_NAME() {
		return properties.getProperty("DEVICE_NAME");
	}

	public static String getPLATFORM_NAME() {
		return properties.getProperty("PLATFORM_NAME");
	}

	public static String getAPP_Path() {
		return properties.getProperty("APP_Path");
	}

	public static String getappPackage() {
		return properties.getProperty("appPackage");
	}

	public static String getappActivity() {
		return properties.getProperty("appActivity");
	}

	public static String getAppium_Server_URL() {
//		properties.getProperty("Appium_Server_URL");
		return properties.getProperty("Appium_Server_URL");
	}

	public static String getEmail() {
		return properties.getProperty("Email");
	}

	public static String getPassword() {
		return properties.getProperty("Password");
	}
	
	public static String getAppPin() {
		return properties.getProperty("AppPin");
	}
	
	public static String getRemarks() {
		return properties.getProperty("Remarks");
	}
	
	public static String getDevice() {
		return properties.getProperty("Device");
	}
	public static String getPLATFORM_VERSION1() {
		return properties.getProperty("PLATFORM_VERSION1");
	}

	public static String getDEVICE_NAME1() {
		return properties.getProperty("DEVICE_NAME1");
	}

}
