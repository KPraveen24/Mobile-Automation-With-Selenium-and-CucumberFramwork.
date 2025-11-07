package function;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.Baseclass;
import dataProviders.ConfigFileReader;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class EIP40_FAS_Function {
	
	static WebDriverWait Webdriverwait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));
	
	public static void MyBench() throws Throwable {
		 		
		Baseclass.wait(60);
		Thread.sleep(7000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_MyBench));
		System.err.println("Home Page : " + ObjectsReporsitory.Home_MyBench.getAttribute("content-desc"));
		ObjectsReporsitory.Home_MyBench.click();
		Thread.sleep(5000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Home_Finance));
		System.err.println("Home Page Document : " +ObjectsReporsitory.Home_Finance.getAttribute("content-desc"));
		ObjectsReporsitory.Home_Finance.click();
	}
	
	public static void IOU() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("I Owe You");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.ICU));
		System.err.println("Document Name : " +ObjectsReporsitory.ICU.getAttribute("content-desc"));
		ObjectsReporsitory.ICU.click();
		
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
	
	}
	
	public static void Reject() throws Throwable {
		
		Baseclass.wait(60);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Reject));
		ObjectsReporsitory.Reject.click();
		Thread.sleep(2000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Popup_Header));
		System.err.println("Header : " + ObjectsReporsitory.Popup_Header.getAttribute("content-desc"));
		Thread.sleep(1000);
		ObjectsReporsitory.Remarks.click();
		ObjectsReporsitory.Remarks.sendKeys(ConfigFileReader.getRemarks());
		Thread.sleep(2000);
		ObjectsReporsitory.Confirm.click();

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
	
	public static void View() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.View));
		ObjectsReporsitory.View.click();
	}
	
	public static void View_No() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_No));
		System.err.println("Document Number : " + ObjectsReporsitory.Document_View_No.getAttribute("content-desc"));
	}
	
	public static void View_Account() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Accounting));
		System.err.println(ObjectsReporsitory.Document_View_Accounting.getAttribute("content-desc"));
	}
	
	public static void View_Date() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Date));
		System.err.println(ObjectsReporsitory.Document_View_Date.getAttribute("content-desc"));
	}
	
	public static void View_Name() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Name));
		System.err.println(ObjectsReporsitory.Document_View_Name.getAttribute("content-desc"));
	}
	
	public static void View_Purpose() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Purpose));
		System.err.println(ObjectsReporsitory.Document_View_Purpose.getAttribute("content-desc"));
	}
	
	public static void View_Type() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Type));
		System.err.println(ObjectsReporsitory.Document_View_Type.getAttribute("content-desc"));
	}
	
	public static void View_Amount() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_Amount));
		System.err.println(ObjectsReporsitory.Document_View_Amount.getAttribute("content-desc"));
	}
	
	public static void View_close() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.Document_View_close));
		ObjectsReporsitory.Document_View_close.click();
		Thread.sleep(2000);
		ObjectsReporsitory.Close.click();
		try {
			Thread.sleep(2000);
			ObjectsReporsitory.Close.click();	
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		
	}
	
	public static void Attachment () throws Throwable {
		
		Baseclass.wait(90);
		Thread.sleep(5000);
		ObjectsReporsitory.Attachment.click();
		Thread.sleep(3000);
		System.err.println("Document Attachment No : "+ ObjectsReporsitory.Attachment_No.getAttribute("content-desc"));
		
		try {
			System.err.println(ObjectsReporsitory.Alert_Details.getAttribute("content-desc"));
			ObjectsReporsitory.Popup_ok.click();
		} catch (Exception e) {
			System.err.println("No Error Msg");
		}
		try {
			System.err.println(ObjectsReporsitory.Attachment_Details.getAttribute("content-desc"));
		} catch (Exception e) {
			System.err.println("Attachment Document is Present");
		}
		try {
			ObjectsReporsitory.Close.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		try {
			ObjectsReporsitory.Close.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}
		try {
			ObjectsReporsitory.Close.click();
		} catch (Exception e) {
			ObjectsReporsitory.Close_Home.click();
		}		
	}
	
	public static void BPB() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.BPB));
		System.err.println("Document Name : " + ObjectsReporsitory.BPB.getAttribute("content-desc"));
		ObjectsReporsitory.BPB.click();	
		
	}
	
	public static void View_Register_Type() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.BPB_Document_Register));
		System.err.println(ObjectsReporsitory.BPB_Document_Register.getAttribute("content-desc"));
	}
	
	public static void View_Favouring() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.BPB_Document_Favouring));
		System.err.println(ObjectsReporsitory.BPB_Document_Favouring.getAttribute("content-desc"));
	}
	
	public static void View_Voucher() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(3000);
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.BPB_Document_Voucher));
		System.err.println(ObjectsReporsitory.BPB_Document_Voucher.getAttribute("content-desc"));
	}
	
	public static void Work_Flow () {
		
		Baseclass.wait(60);
		ObjectsReporsitory.Trace.click();
	}
	
	public static void List_Trace() throws Throwable {
		
		Baseclass.wait(60);
		System.err.println(ObjectsReporsitory.Initiator.getAttribute("content-desc"));
		System.err.println(ObjectsReporsitory.Initiator_User.getAttribute("content-desc"));
		
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
	
	public static void CPB_List_Trace() throws Throwable {
		
		Baseclass.wait(60);
		System.err.println(ObjectsReporsitory.Initiator.getAttribute("content-desc"));
		System.err.println(ObjectsReporsitory.Initiator_User.getAttribute("content-desc"));
		System.err.println(ObjectsReporsitory.HQ_IC.getAttribute("content-desc"));
		Baseclass.Android_Scroll_Buttom("HQ-IC Accounts - Approver");
		System.err.println(ObjectsReporsitory.HQ_Approver.getAttribute("content-desc"));
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
	
	public static void BRB() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Bank Receipt Booking");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.BRB));
		System.err.println("Document Name : " +ObjectsReporsitory.BRB.getAttribute("content-desc"));
		ObjectsReporsitory.BRB.click();	
	}
	public static void CPB() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Cash Payment Booking");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.CPB));
		System.err.println("Document Name : " +ObjectsReporsitory.CPB.getAttribute("content-desc"));
		ObjectsReporsitory.CPB.click();	
	}
	public static void CRB() throws Throwable {
		
		Baseclass.wait(60);
		Thread.sleep(5000);
		Baseclass.Android_Scroll_Buttom("Cash Receipt Booking");
		Webdriverwait.until(ExpectedConditions.elementToBeClickable(ObjectsReporsitory.CRB));
		System.err.println("Document Name : " +ObjectsReporsitory.CRB.getAttribute("content-desc"));
		ObjectsReporsitory.CRB.click();	
	}
	
}
