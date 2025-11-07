package function;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class EIP40_SCM_Function {
	
	static WebDriverWait Webdriverwait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));

	public static void MyBench() throws Throwable {
		 		
		Baseclass.wait(60);
		Thread.sleep(7000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_MyBench));
		System.err.println("Home Page : " + ObjectsReporsitory.Home_MyBench.getAttribute("content-desc"));
		ObjectsReporsitory.Home_MyBench.click();
		
	}
	
	public static void SCM() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_SCM));
		System.err.println("Home Page Document : " +ObjectsReporsitory.Home_SCM.getAttribute("content-desc"));
		ObjectsReporsitory.Home_SCM.click();
	}
	
	public static void PR() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Purchase Request");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.PR));
		System.err.println("Document Name : " +ObjectsReporsitory.PR.getAttribute("content-desc"));
		ObjectsReporsitory.PR.click();
		
	}
	
	public static void SR() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Service Request");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.SR));
		System.err.println("Document Name : " +ObjectsReporsitory.SR.getAttribute("content-desc"));
		ObjectsReporsitory.SR.click();
		
	}
	
	public static void TCD() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("TCD");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.TCD));
		System.err.println("Document Name : " +ObjectsReporsitory.TCD.getAttribute("content-desc"));
		ObjectsReporsitory.TCD.click();
		
	}
	
	public static void MRN() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Material Receipt Note Approval ");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MRN));
		System.err.println("Document Name : " +ObjectsReporsitory.TCD.getAttribute("content-desc"));
		ObjectsReporsitory.MRN.click();
		
	}
	
	public static void Bill() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("BILL");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Bill));
		System.err.println("Document Name : " +ObjectsReporsitory.TCD.getAttribute("content-desc"));
		ObjectsReporsitory.Bill.click();
		
	}
	
	public static void selected() {
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.selected));
		ObjectsReporsitory.selected.click();
	}
	
	public static void Approve() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Approve));
		ObjectsReporsitory.Approve.click();
		Thread.sleep(4000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Yes));
		try {
			ObjectsReporsitory.Popup_Yes.click();
		} catch (Exception e) {
			ObjectsReporsitory.Popup_No.click();
		}
		
	}
	
	public static void Hold_Icon () throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Hold_Icon));
		ObjectsReporsitory.Hold_Icon.click();
		
	}
	
	public static void Hold() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Hold));
		ObjectsReporsitory.Hold.click();
		Thread.sleep(4000);
		ObjectsReporsitory.Remarks.click();
		ObjectsReporsitory.Remarks.sendKeys(ConfigFileReader.getRemarks());
		ObjectsReporsitory.Confirm.click();
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Alert_Success));
		System.err.println("Header : " + ObjectsReporsitory.Alert_Success.getAttribute("content-desc"));
		System.err.println("Details : " +  ObjectsReporsitory.Alert_Details.getAttribute("content-desc"));
		Thread.sleep(1000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_ok));
		ObjectsReporsitory.Popup_ok.click();
		Thread.sleep(2000);
/*		Thread.sleep(4000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Yes));
		try {
			ObjectsReporsitory.Popup_Yes.click();
		} catch (Exception e) {
			ObjectsReporsitory.Popup_No.click();
		}		*/
	}
	
public static void Hold_TCD() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Hold_TCD));
		ObjectsReporsitory.Hold_TCD.click();
		Thread.sleep(4000);
		ObjectsReporsitory.Remarks.click();
		ObjectsReporsitory.Remarks.sendKeys(ConfigFileReader.getRemarks());
		ObjectsReporsitory.Confirm.click();
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Alert_Success));
		System.err.println("Header : " + ObjectsReporsitory.Alert_Success.getAttribute("content-desc"));
		System.err.println("Details : " +  ObjectsReporsitory.Alert_Details.getAttribute("content-desc"));
		Thread.sleep(1000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_ok));
		ObjectsReporsitory.Popup_ok.click();
		Thread.sleep(2000);
/*		Thread.sleep(4000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Yes));
		try {
			ObjectsReporsitory.Popup_Yes.click();
		} catch (Exception e) {
			ObjectsReporsitory.Popup_No.click();
		}		*/
	}
	
public static void TDSHold() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Hold_Icon));
		ObjectsReporsitory.Hold_Icon.click();
		Thread.sleep(4000);
		ObjectsReporsitory.Remarks.click();
		ObjectsReporsitory.Remarks.sendKeys(ConfigFileReader.getRemarks());
		ObjectsReporsitory.Confirm.click();
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Alert_Success));
		System.err.println("Header : " + ObjectsReporsitory.Alert_Success.getAttribute("content-desc"));
		System.err.println("Details : " +  ObjectsReporsitory.Alert_Details.getAttribute("content-desc"));
		Thread.sleep(1000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_ok));
		ObjectsReporsitory.Popup_ok.click();
		Thread.sleep(2000);
/*		Thread.sleep(4000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Yes));
		try {
			ObjectsReporsitory.Popup_Yes.click();
		} catch (Exception e) {
			ObjectsReporsitory.Popup_No.click();
		}		*/
	}
	
	public static void Alert() throws Throwable {
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Alert_Success));
		System.err.println("Header : " + ObjectsReporsitory.Alert_Success.getAttribute("content-desc"));
		System.err.println("Details : " +  ObjectsReporsitory.Alert_Details.getAttribute("content-desc"));
		Thread.sleep(1000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_ok));
		ObjectsReporsitory.Popup_ok.click();
		Thread.sleep(2000);
		ObjectsReporsitory.Close.click();
		Thread.sleep(2000);
		ObjectsReporsitory.Close.click();
		try {
			Thread.sleep(2000);
			ObjectsReporsitory.Close.click();	
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
	}
	
	public static void Hold_Alert() {
		
		ObjectsReporsitory.Close.click();
		ObjectsReporsitory.Close.click();
	}
	
	public static void Reject() throws Throwable {
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Reject));
		ObjectsReporsitory.Reject.click();
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		
		ObjectsReporsitory.Remarks.sendKeys(ConfigFileReader.getRemarks());
		Thread.sleep(2000);
		ObjectsReporsitory.Confirm.click();

	}
	
	public static void PR_List_Trace() throws Throwable {
		
		Baseclass.wait(60);
		System.err.println(ObjectsReporsitory.Initiator.getAttribute("content-desc"));
		System.err.println(ObjectsReporsitory.Initiator_User.getAttribute("content-desc"));
		
		List<WebElement> list =   ObjectsReporsitory.list_trace;
		
		for (WebElement trace : list) {			
			System.err.println(trace.getAttribute("content-desc"));			
		}
		
		/*System.err.println(ObjectsReporsitory.HQ_IC.getAttribute("content-desc"));
		Baseclass.Android_Scroll_Buttom("HQ-IC Accounts - Approver");
		System.err.println(ObjectsReporsitory.HQ_Approver.getAttribute("content-desc"));*/
		Thread.sleep(1000);
		try {
			ObjectsReporsitory.Back.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		Thread.sleep(1000);
		try {
			ObjectsReporsitory.Close.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		Thread.sleep(1000);
		try {
			ObjectsReporsitory.Close_Home.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close.click();
		}				
	}
	
	public static void Logout() throws Throwable {
		
		WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Menu));
		ObjectsReporsitory.Home_Menu.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Menu_Logout));
		ObjectsReporsitory.Home_Menu_Logout.click();
		try {
			System.err.println("Header : " + ObjectsReporsitory.Popup_Header_Logout.getAttribute("content-desc"));
			System.err.println("Details : " + ObjectsReporsitory.Popup_Details.getAttribute("content-desc"));
		} catch (Exception e) {
			System.out.println();
		}
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Menu_Logout_Confirm));
		ObjectsReporsitory.Home_Menu_Logout_Confirm.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Signin_Email));
		System.out.println("user Loggedout Successfully");
	}
	
	public static void Job() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Job_code));
		System.err.println(ObjectsReporsitory.Job_code.getAttribute("content-desc"));
	}
	
	public static void Received_from() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Received_from));
		System.err.println(ObjectsReporsitory.Received_from.getAttribute("content-desc"));
	}
	
	public static void Received_to() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Received_to));
		System.err.println(ObjectsReporsitory.Received_to.getAttribute("content-desc"));
	}
	
	public static void Sender_Remark() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Sender_Remark));
		System.err.println(ObjectsReporsitory.Sender_Remark.getAttribute("content-desc"));
	}

	public static void Approver_Remark() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Approver_Remark));
		System.err.println(ObjectsReporsitory.Approver_Remark.getAttribute("content-desc"));	
	}
	
	public static void MRN_View() throws Throwable {
		
		Baseclass.wait(1);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MRN_View));
		ObjectsReporsitory.MRN_View.click();
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.MRN_View_close));
		ObjectsReporsitory.MRN_View_close.click();
		
		
	}
	
}
