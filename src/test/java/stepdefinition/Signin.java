package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class Signin extends ObjectsReporsitory {

	public static ConfigFileReader configFileReader;

	static WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));
	public static JavascriptExecutor jse = (JavascriptExecutor) Server.driver;

	@Given("^Verify user can be able to Launch EIP40Mobile Application$")
	public static void Verify_user_can_be_able_to_Launch_EIP40Mobile_Application() throws InterruptedException {
//		Thread.sleep(35000);
		System.out.println(" ");
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Email));
		System.out.println("EIP40 Mobile Application Launched");
		System.out.println("");
	}

	@Then("^Verify user can be able to Enter Email ID$")
	public static void Verify_user_can_be_able_to_Enter_Email_ID() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Email));
		object_repository.ObjectsReporsitory.Signin_Email.sendKeys(ConfigFileReader.getEmail());
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_NextBtn));
		object_repository.ObjectsReporsitory.Signin_NextBtn.click();
		System.out.println("User can be able to enter Email ID");
		System.out.println("");
	}

	@Then("^Verify user can be able to Enter Password$")
	public static void Verify_user_can_be_able_to_Enter_Password() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Password));
		object_repository.ObjectsReporsitory.Signin_Password.sendKeys(ConfigFileReader.getPassword());
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_SigninBtn));
		System.out.println("User can be able to enter Password");
		System.out.println("");
	}

	@Then("^Verify user can be able to Sign_in to EIP40App$")
	public static void Verify_user_can_be_able_to_Sign_in_to_EIP40App() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_SigninBtn));
		System.out.println("User can be able to clicked on sign in ");
		System.out.println("");
		object_repository.ObjectsReporsitory.Signin_SigninBtn.click();

	}

	@Then("^Verify user can be able to Choose Stay Signed in$")
	public static void Verify_user_can_be_able_to_Choose_Stay_Signed_in() throws InterruptedException {
		Thread.sleep(20000);
		Server.driver.pressKey(new KeyEvent(AndroidKey.SPACE));
		Thread.sleep(5000);
		System.out.println("User can be able to stay signed in EIP mobile application");
		System.out.println("");
		// wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Signin_StaySignin_yes)).click();
	}

	@Then("^Verify Name and Email Id displayed Correctly$")
	public static void Verify_Name_and_Email_Id_displayed_Correctly() throws InterruptedException {

		wait.until(
				ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Register_device));
		System.err
				.println("Signed In User Name : " + object_repository.ObjectsReporsitory.Signin_Verify_Name.getText());
		System.out.println("");
		System.err
				.println("Signed In Email ID : " + object_repository.ObjectsReporsitory.Signin_Verify_Email.getText());
		System.out.println("");
	}

	@Then("^Verify user can be able to Enter mobile app PIN$")
	public static void Verify_user_can_be_able_to_Enter_mobile_app_PIN() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_pin));
		object_repository.ObjectsReporsitory.Signin_pin.click();
		Thread.sleep(5000);
		object_repository.ObjectsReporsitory.Signin_pin.clear();
		object_repository.ObjectsReporsitory.Signin_pin.click();
		object_repository.ObjectsReporsitory.Signin_pin.sendKeys(ConfigFileReader.getAppPin());
		System.out.println("Device PIN Entered");
		System.out.println("");
	}

	@Then("^Verify user can be able to Enter mobile app PIN to confirm$")
	public static void Verify_user_can_be_able_to_Enter_mobile_app_PIN_to_confirm() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Confirm_pin));
		object_repository.ObjectsReporsitory.Signin_Confirm_pin.click();
		Thread.sleep(5000);
		object_repository.ObjectsReporsitory.Signin_Confirm_pin.clear();
		object_repository.ObjectsReporsitory.Signin_Confirm_pin.click();
		object_repository.ObjectsReporsitory.Signin_Confirm_pin.sendKeys(ConfigFileReader.getAppPin());
		System.out.println("Device PIN Confirmed");
		System.out.println("");
	}

	@Then("^Verify user can be able to Register Device$")
	public static void Verify_user_can_be_able_to_Register_Device() throws InterruptedException {

		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Register_device));
		object_repository.ObjectsReporsitory.Signin_Register_device.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Signin_Register_device_confirm));
		try {
			System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
			System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		} catch (Exception e) {
			System.out.println();
		}
		
		object_repository.ObjectsReporsitory.Signin_Register_device_confirm.click();
		Thread.sleep(3000);
		System.out.println("Device Registred");
		System.out.println("");
		wait.until(ExpectedConditions.elementToBeClickable(object_repository.ObjectsReporsitory.Login_Pin));

	}

}
