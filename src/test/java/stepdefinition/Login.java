package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class Login {

	static WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));

	public static ConfigFileReader configFileReader;

	public Login() {
		PageFactory.initElements(Server.driver, ObjectsReporsitory.class);
	}

	@Given("^Verify user can be able to Signin to EIP Mobile Application$")
	public static void Verify_user_can_be_able_to_Signin_to_EIP_Mobile_Application() throws InterruptedException {

		Signin.Verify_user_can_be_able_to_Launch_EIP40Mobile_Application();
		Signin.Verify_user_can_be_able_to_Enter_Email_ID();
		Signin.Verify_user_can_be_able_to_Enter_Password();
		Signin.Verify_user_can_be_able_to_Sign_in_to_EIP40App();
		Signin.Verify_user_can_be_able_to_Choose_Stay_Signed_in();
		Signin.Verify_Name_and_Email_Id_displayed_Correctly();
		Signin.Verify_user_can_be_able_to_Enter_mobile_app_PIN();
		Signin.Verify_user_can_be_able_to_Enter_mobile_app_PIN_to_confirm();
		Signin.Verify_user_can_be_able_to_Register_Device();

	}

	@Then("^Verify user can be able to Enter Device Pin$")
	public static void Verify_user_can_be_able_to_Enter_Device_Pin() throws InterruptedException {
		Thread.sleep(3000);
		// Change As per APP PIN - Issue Raised
		Server.driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		Server.driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		Server.driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		Server.driver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_MyBench));
	}

	@Then("^Verify user can be able to Login EIPMobile Application$")
	public static void Verify_user_can_be_able_to_Login_EIPMobile_Application() throws InterruptedException {
		Login.Verify_user_can_be_able_to_Signin_to_EIP_Mobile_Application();
		Login.Verify_user_can_be_able_to_Enter_Device_Pin();
		WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_MyBench));
		System.out.println("User can be able to Logged in EIP mobile Application");
		System.err.println("");
	}

	@Given("^Verify user can be able to Logout to EIP Mobile Application$")
	public static void Verify_user_can_be_able_to_Logout_to_EIP_Mobile_Application() throws InterruptedException {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(50));
		try {
			ObjectsReporsitory.Close.click();	
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Menu_Logout));
		ObjectsReporsitory.Home_Menu_Logout.click();
		Thread.sleep(1000);
		try {
			System.err.println("Header : " + ObjectsReporsitory.Popup_Header_Logout.getAttribute("content-desc"));
		} catch (Exception e) {
			System.out.println();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Menu_Logout_Confirm));
		ObjectsReporsitory.Home_Menu_Logout_Confirm.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Signin_Email));
		System.out.println("user Loggedout Successfully");
	}
}