package object_repository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.Server;

public class ObjectsReporsitory extends Server {


	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@resource-id='i0116']")
	public static WebElement Signin_Email;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@resource-id='idSIButton9']")
	public static WebElement Signin_NextBtn;

	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@resource-id='i0118']")
	public static WebElement Signin_Password;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@resource-id='idSIButton9']")
	public static WebElement Signin_SigninBtn;

	@FindBy(how = How.XPATH, using = "//android.webkit.WebView[@index='2']")
	public static WebElement Signin_StaySignin_yes;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]")
	public static WebElement Signin_Verify_Name;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]")
	public static WebElement Signin_Verify_Email;

	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@index='2']")
	public static WebElement Signin_pin;

	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@index='3']")
	public static WebElement Signin_Confirm_pin;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='Register Device']")
	public static WebElement Signin_Register_device;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='OK']")
	public static WebElement Signin_Register_device_confirm;

	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Enter Device PIN to Login']")
	public static WebElement Login_Pin;

	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'menu')]")
	public static WebElement Home_Menu;

	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Home']")
	public static WebElement Home_Menu_Home;

	@FindBy(how = How.XPATH, using = "//*[@content-desc='Logout']")
	public static WebElement Home_Menu_Logout;

	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Exit']")
	public static WebElement Home_Menu_Exit;

	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'MyBench')]")
	public static WebElement Home_MyBench;

	@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='EIP 4.0']")
	public static WebElement Home_EIP40;

	@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='Trace Doc']")
	public static WebElement Home_TraceDoc;

	@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='Car Pool']")
	public static WebElement Home_CarPool;

	@FindBy(how = How.XPATH, using = "//android.widget.ImageView[@content-desc='MyZone']")
	public static WebElement Home_MyZone;

	@FindBy(how = How.XPATH, using = "//*[@content-desc='OK']")
	public static WebElement Home_Menu_Logout_Confirm;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'I Owe You')]")
	public static WebElement ICU;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[contains(@content-desc,'LE')][1]")
	public static WebElement selected;
	
	@FindBy(how = How.XPATH, using = "(//android.widget.Button[contains(@content-desc,'Approve')])[1]")
	public static WebElement Approve;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Reject')][1]")
	public static WebElement Reject;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@content-desc,'Hold')])[1]")
	public static WebElement Hold	;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@content-desc,'Hold')])[2]")
	public static WebElement Hold_TCD	;
	
	@FindBy(how = How.XPATH, using = "(//*[contains(@content-desc,'Hold')])[1]")
	public static WebElement Hold_Icon	;
	
	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='Yes']")
	public static WebElement Popup_Yes;
	
	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='NO']")
	public static WebElement Popup_No;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[contains(@content-desc,'Confirmation')]")
	public static WebElement Popup_Header;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Logout')]")
	public static WebElement Popup_Header_Logout;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[contains(@content-desc,'D')]")
	public static WebElement Popup_Details;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'OK')]")
	public static WebElement Popup_ok;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Success']")
	public static WebElement Alert_Success;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'request')]")
	public static WebElement Alert_Details;
	
	@FindBy(how = How.XPATH, using = "(//*[@class='android.widget.Button'])[1]")
	public static WebElement Close;
	
	@FindBy(how = How.CLASS_NAME, using = "android.widget.Button")
	public static WebElement Close_Home;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Finance')]")
	public static WebElement Home_Finance;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Supply Chain')]")
	public static WebElement Home_SCM;

	@FindBy(how = How.XPATH, using = "//*[@class='android.widget.EditText']")
	public static WebElement Remarks;

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='Confirm']")
	public static WebElement Confirm;
	
	@FindBy(how = How.XPATH, using = "//*[@content-desc='View Details'][1]")
	public static WebElement View;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'LE')][1]")
	public static WebElement Document_View_No;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Accounting')]")
	public static WebElement Document_View_Accounting;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Date')]")
	public static WebElement Document_View_Date;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Name')]")
	public static WebElement Document_View_Name;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Purpose')]")
	public static WebElement Document_View_Purpose;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Type')]")
	public static WebElement Document_View_Type;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Amount')]")
	public static WebElement Document_View_Amount;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Close')]")
	public static WebElement Document_View_close;
	
	@FindBy(how = How.XPATH, using = "//*[ contains(@content-desc,'LE')][1]/*[2]")
	public static WebElement Attachment;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'LE')]")
	public static WebElement Attachment_No;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Show')]")
	public static WebElement Attachment_Details;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Bank Payment Booking')]")
	public static WebElement BPB;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Register')]")
	public static WebElement BPB_Document_Register;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Favouring')]")
	public static WebElement BPB_Document_Favouring;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Voucher')]")
	public static WebElement BPB_Document_Voucher;
	
	@FindBy(how = How.XPATH, using = "(//android.view.View[contains(@content-desc,'LE')])[1]/android.widget.ImageView[1]")
	public static WebElement Trace;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Initiator']")
	public static WebElement Initiator;
	
	@FindBy(how = How.CLASS_NAME, using = "android.view.View")
	public static WebElement Initiator_User;
	
	@FindBy(how = How.XPATH, using = "//*[@content-desc='Back']")
	public static WebElement Back;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Bank Receipt Booking')]")
	public static WebElement BRB;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Cash Payment Booking')]")
	public static WebElement CPB;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'HQ-IC Accounts -  Creator')]")
	public static WebElement HQ_IC;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'HQ-IC Accounts - Approver')]")
	public static WebElement HQ_Approver;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Cash Receipt Booking')]")
	public static WebElement CRB;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Purchase Request')]")
	public static WebElement PR;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Description')]")
	public static WebElement Job_code;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Received')][1]")
	public static WebElement Received_from;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Received')][2]")
	public static WebElement Received_to;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Sender')]")
	public static WebElement Sender_Remark;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Approver')]")
	public static WebElement Approver_Remark;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Head')]")
	public static List<WebElement> list_trace ;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Service Request')]")
	public static WebElement SR;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'TCD Request Approval')]")
	public static WebElement TCD;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Material Receipt Note Approval')]")
	public static WebElement MRN;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Bills Approval')]")
	public static WebElement Bill;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'View Detail')]")
	public static WebElement MRN_View;
	
	@FindBy(how = How.CLASS_NAME, using = "android.widget.Button")
	public static WebElement MRN_View_close;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@content-desc,'Action Taken')]")
	public static WebElement Action_Taken;
		
}
