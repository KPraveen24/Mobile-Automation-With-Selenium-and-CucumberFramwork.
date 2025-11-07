package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataProviders.ConfigFileReader;
import function.EIP40_SCM_Function;
import io.cucumber.java.en.When;
import object_repository.ObjectsReporsitory;
import utils.Server;

public class EIP40_SCM {
	
	static WebDriverWait wait = new WebDriverWait(Server.driver, Duration.ofSeconds(30));
	public static ConfigFileReader configFileReader;
	
	public EIP40_SCM() {
		PageFactory.initElements(Server.driver, ObjectsReporsitory.class);
	}

	@When("Verify user can be able to click on Work Bench EIP40Mobile")
	public void verify_user_can_be_able_to_click_on_work_bench_eip40mobile() throws Throwable {
	    EIP40_SCM_Function.MyBench();
	}
	@When("Verify user can able to click on SCM")
	public void verify_user_can_able_to_click_on_scm() throws Throwable {
	    EIP40_SCM_Function.SCM();
	}
	@When("Verify user can able to select PR Document")
	public void verify_user_can_able_to_select_pr_document() throws Throwable {
	    EIP40_SCM_Function.PR();
	}
	@When("Verify user can able to Hold to Document")
	public void verify_user_can_able_to_hold_to_document() throws Throwable {
	    EIP40_SCM_Function.Hold();
	}
		
	
	@When("Verify user can able to Hold to TCD Document")
	public void verify_user_can_able_to_hold_to_tcd_document() throws Throwable {
		EIP40_SCM_Function.Hold_TCD();
	}
	
	@When("Verify user can able to click on Hold icon")
	public void verify_user_can_able_to_click_on_hold_icon() throws Throwable {
	    EIP40_SCM_Function.Hold_Icon();
	}
	@When("Verify user can able to Hold in Approve to Document")
	public void verify_user_can_able_to_hold_in_approve_to_document() throws Throwable {
	    EIP40_SCM_Function.Approve();
	}

	@When("Verify user can able to Hold and Reject to Document")
	public void verify_user_can_able_to_hold_and_reject_to_document() throws Throwable {
	    EIP40_SCM_Function.Reject();
	}
	
	@When("Verify user can be Get Job")
	public void verify_user_can_be_get_job() throws Throwable {
	    EIP40_SCM_Function.Job();
	}
	@When("Verify user can be Get Receivec from")
	public void verify_user_can_be_get_receivec_from() throws Throwable {
	    EIP40_SCM_Function.Received_from();
	}
	@When("Verify user can ve Get Receivec date")
	public void verify_user_can_ve_get_receivec_date() throws Throwable {
	    EIP40_SCM_Function.Received_to();
	}
	@When("Verify user can be Get sender remarks")
	public void verify_user_can_be_get_sender_remarks() throws Throwable {
	    EIP40_SCM_Function.Sender_Remark();
	}
	@When("Verify user can be Get Approver remarks")
	public void verify_user_can_be_get_approver_remarks() throws Throwable {
	    EIP40_SCM_Function.Approver_Remark();
	}	
	@When("Verify user can able to get listout flow from PR")
	public void verify_user_can_able_to_get_listout_flow_from_pr() throws Throwable {
	    EIP40_SCM_Function.PR_List_Trace();
	}

	@When("Verify user can able to select SR Document")
	public void verify_user_can_able_to_select_sr_document() throws Throwable {
	    EIP40_SCM_Function.SR();
	}
	@When("Verify user can able to get listout flow from SR")
	public void verify_user_can_able_to_get_listout_flow_from_sr() throws Throwable {
	    EIP40_SCM_Function.PR_List_Trace();
	}
	
	@When("Verify user can able to select TCD Document")
	public void verify_user_can_able_to_select_tcd_document() throws Throwable {
		EIP40_SCM_Function.TCD();
	}
	
	@When("Verify user can able to select MRN Document")
	public void verify_user_can_able_to_select_mrn_document() throws Throwable {
		EIP40_SCM_Function.MRN();
	}
	@When("Verify user can able to View to Document")
	public void verify_user_can_able_to_view_to_document() throws Throwable {
		EIP40_SCM_Function.MRN_View();
	}
	
	@When("Verify user can able to select Bill  Document")
	public void verify_user_can_able_to_select_bill_document() throws Throwable {
	    EIP40_SCM_Function.Bill();
	}
	
}
