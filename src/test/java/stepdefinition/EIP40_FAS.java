package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import function.EIP40_FAS_Function;
import function.EIP40_SCM_Function;
import io.cucumber.java.en.When;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class EIP40_FAS {
	
	static WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));


	public static ConfigFileReader configFileReader;

	public EIP40_FAS() {
		PageFactory.initElements(Server.driver, ObjectsReporsitory.class);
	}
	
	@When("Verify user can be able to click on Work Bench")
	public void verify_user_can_be_able_to_click_on_work_bench() throws Throwable {
	    EIP40_FAS_Function.MyBench();
	}
	@When("Verify user can be able to select to IOU Document")
	public void verify_user_can_be_able_to_select_to_iou_document() throws Throwable {
	    EIP40_FAS_Function.IOU();
	}
	@When("Verify user can able to select to Document")
	public void verify_user_can_able_to_select_to_document() {
	    EIP40_FAS_Function.selected();
	}
	@When("Verify user can able to Approve to Document")
	public void verify_user_can_able_to_approve_to_document() throws Throwable {
	    EIP40_FAS_Function.Approve();
	}
	@When("Verify user can able to Handle Alert Message")
	public void verify_user_can_able_to_handle_alert_message() throws Throwable {
	    EIP40_FAS_Function.Alert();
	}
	@When("Verify user can able to Handle Alert Message from Hold")
	public void verify_user_can_able_to_handle_alert_message_from_Hold() throws Throwable {
	    EIP40_SCM_Function.Hold_Alert();
	}
	@When("Verify user can able to Rejeted to Document")
	public void verify_user_can_able_to_rejeted_to_document() throws Throwable {
	    EIP40_FAS_Function.Reject();
	}
	
	@When("Verify user can be click to View the Document")
	public void verify_user_can_be_click_to_view_the_document() throws Throwable {
	    EIP40_FAS_Function.View();
	}
	@When("Verify user can be Get Document Number")
	public void verify_user_can_be_get_document_number() throws Throwable {
	    EIP40_FAS_Function.View_No();
	}
	@When("Verify user can be Get Accounting Center")
	public void verify_user_can_be_get_accounting_center() throws Throwable {
	    EIP40_FAS_Function.View_Account();
	}
	@When("Verify user can be Get Document Creater Date")
	public void verify_user_can_be_get_document_creater_date() throws Throwable {
	    EIP40_FAS_Function.View_Date();
	}
	@When("Verify user can be Get Document Creater Name")
	public void verify_user_can_be_get_document_creater_name() throws Throwable {
	    EIP40_FAS_Function.View_Name();
	}
	@When("Verify user can be Get Document Purpose")
	public void verify_user_can_be_get_document_purpose() throws Throwable {
	    EIP40_FAS_Function.View_Purpose();
	}
	@When("Verify user can be Get Document Type")
	public void verify_user_can_be_get_document_type() throws Throwable {
	    EIP40_FAS_Function.View_Type();
	}
	@When("Verify user can be Get Amount")
	public void verify_user_can_be_get_amount() throws Throwable {
	    EIP40_FAS_Function.View_Amount();
	}
	@When("Verify user can be close to view page")
	public void verify_user_can_be_close_to_view_page() throws Throwable {
	    EIP40_FAS_Function.View_close();
	}
	
	@When("Verify user can be to Attachment view")
	public void verify_user_can_be_to_attachment_view() throws Throwable {
	    EIP40_FAS_Function.Attachment();
	}
	@When("Verify user can de able to select BPB Document")
	public void verify_user_can_de_able_to_select_bpb_document() throws Throwable {
	    EIP40_FAS_Function.BPB();
	}
	
	@When("Verify user can be Get Document Register Type")
	public void verify_user_can_be_get_document_register_type() throws Throwable {
	    EIP40_FAS_Function.View_Register_Type();
	}
	@When("Verify user can ve Get Document Favouring")
	public void verify_user_can_ve_get_document_favouring() throws Throwable {
	    EIP40_FAS_Function.View_Favouring();
	}
	@When("Verify user can be Get Document Voucher Amount")
	public void verify_user_can_be_get_document_voucher_amount() throws Throwable {
	    EIP40_FAS_Function.View_Voucher();
	}
	@When("Verify user can able to click on Work flow trace")
	public void verify_user_can_able_to_click_on_work_flow_trace() {
	   EIP40_FAS_Function.Work_Flow();
	}
	@When("Verify user can able to get listout flow")
	public void verify_user_can_able_to_get_listout_flow() throws Throwable {
	    EIP40_FAS_Function.List_Trace();
	}
	@When("Verify user can de able to select BRB Document")
	public void verify_user_can_de_able_to_select_brb_document() throws Throwable {
	    EIP40_FAS_Function.BRB();
	}
	@When("Verify user can de able to select CPB Document")
	public void verify_user_can_de_able_to_select_cpb_document() throws Throwable {
	    EIP40_FAS_Function.CPB();
	}
	@When("Verify user can able to get listout flow from CPB")
	public void verify_user_can_able_to_get_listout_flow_from_cpb() throws Throwable {
	    EIP40_FAS_Function.CPB_List_Trace();
	}
	@When("Verify user can de able to select CRB Document")
	public void verify_user_can_de_able_to_select_crb_document() throws Throwable {
	    EIP40_FAS_Function.CRB();
	}
	@When("Verify user can able to get listout flow from CRB")
	public void verify_user_can_able_to_get_listout_flow_from_crb() throws Throwable {
		EIP40_FAS_Function.CPB_List_Trace();
	}

	
}
