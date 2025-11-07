package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import object_repository.ObjectsReporsitory;

import dataProviders.ConfigFileReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Server {

	public static AndroidDriver driver;
	WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(10));
	
	public static AppiumDriverLocalService service;
	
	public static ObjectsReporsitory ObjectsReporsitory;
	
	public static ConfigFileReader configFileReader;
	
//	public static String NodeExepath  =  "C:\\Program Files\\nodejs";
	public static String NodeJSmainPath = "\\Users\\99906188\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js";
	public static String ServerAddress = "127.0.0.1";
	public static String LogFile = "\\src\\reports\\Logger\\Server.txt";
	
	public static void createDriver() throws MalformedURLException, InterruptedException {
		
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
//				.usingDriverExecutable(new File( NodeExepath)).
				.withAppiumJS(new File	(NodeJSmainPath))
				.withIPAddress(ServerAddress).withArgument(GeneralServerFlag.BASEPATH, "/wd/hub")
				.usingPort(4723).withLogFile(new File(LogFile)));
		
		System.out.println(" . . . . .     Starting Appium Server      .   . . . .");
		
		service.start();
		
		try {
			
			ConfigFileReader file = new ConfigFileReader();

			String Statment = file.getDevice();
			
			switch (Statment) {
			case "Single":
				
				configFileReader = new ConfigFileReader();
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigFileReader.getPLATFORM_VERSION());
				capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFileReader.getDEVICE_NAME());
				capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigFileReader.getPLATFORM_NAME());
				capabilities.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + ConfigFileReader.getAPP_Path());
				capabilities.setCapability("appPackage", ConfigFileReader.getappPackage());
				capabilities.setCapability("appActivity", ConfigFileReader.getappActivity());
				driver = new AndroidDriver(new URL(ConfigFileReader.getAppium_Server_URL()), capabilities);
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
				System.err.println("");
				System.err.println("Mobile Andorid  Version : " + ConfigFileReader.getPLATFORM_VERSION() );
				System.err.println("Mobile Device Name : " + ConfigFileReader.getDEVICE_NAME1() );
				System.err.println("Platform Name : " + ConfigFileReader.getPLATFORM_NAME() );
				System.err.println("");
				break;

			case "Mutiple":
				
				configFileReader = new ConfigFileReader();
				DesiredCapabilities capabilities1 = new DesiredCapabilities();
				capabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigFileReader.getPLATFORM_VERSION());				
				capabilities1.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFileReader.getDEVICE_NAME());				
				capabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigFileReader.getPLATFORM_NAME());				
				capabilities1.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + ConfigFileReader.getAPP_Path());
				capabilities1.setCapability("appPackage", ConfigFileReader.getappPackage());
				capabilities1.setCapability("appActivity", ConfigFileReader.getappActivity());
				driver = new AndroidDriver(new URL(ConfigFileReader.getAppium_Server_URL()), capabilities1);
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
				
				
				capabilities1.setCapability(MobileCapabilityType.PLATFORM_VERSION, ConfigFileReader.getPLATFORM_VERSION1());
				capabilities1.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigFileReader.getDEVICE_NAME1());
				capabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigFileReader.getPLATFORM_NAME());
				capabilities1.setCapability(MobileCapabilityType.APP,
				System.getProperty("user.dir") + ConfigFileReader.getAPP_Path());
				capabilities1.setCapability("appPackage", ConfigFileReader.getappPackage());
				capabilities1.setCapability("appActivity", ConfigFileReader.getappActivity());
				driver = new AndroidDriver(new URL(ConfigFileReader.getAppium_Server_URL()), capabilities1);
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
				
				break;
			}
		

		} catch (Exception e) {
			System.out.println("Unable to lauch browser due to: " + e.toString());
		}
	
	}

	public static void driverQuit() {
		if (driver != null) {
			driver.quit();
		}
	}
}
