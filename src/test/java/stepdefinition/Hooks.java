package stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.MyScreenRecorder;
import utils.Server;

public class Hooks {

	@Before
	public void beforeScenario(Scenario scenario) throws Exception {
		
		System.err.println("");
		System.err.println("...................Hi..........................");
		System.err.println("");
		System.err.println(".........................Welcome to Mobile Automation Execute to EIP40 ...................");
		System.err.println("");
		String Author = System.getProperty("user.name");
		String ScenarioName = scenario.getName();
		System.err.println("");
		System.out.println(ScenarioName + ": Testing Started");
		System.out.println("");
		Date currentDate = new Date();
		System.out.println("Testing Started at : " + currentDate);
		System.out.println("");
		System.out.println("Tested By : " + Author);
		System.out.println("");
		Server.createDriver();
		
		PageFactory.initElements(Server.driver, object_repository.ObjectsReporsitory.class);
		
		
		 if (ConfigFileReader.getScreenrecord().contains("True")) {
		  MyScreenRecorder.startRecording(scenario.getName());
		  System.out.println("Recording Screen");
		  System.out.println(""); } 
		 else
		  { System.out.println("ScreenRecording Will Set to Off"); 
		  System.out.println("");
		  }
		 	
	}

	@After()
	public void tearDown(Scenario scenario) throws Exception {

		new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

		scenario.getName();

		Date currentDate = new Date();
		String ScenarioName = scenario.getName();
		System.out.println("");
		System.err.println("...............Thanks You.....................");
		System.err.println("");
		System.err.println("...........................  Mobile Automation Executed to EIP40  ...................");		
		System.out.println("");
		System.out.println(ScenarioName + " : Scenario Testing Completed");
		System.out.println("");
		System.out.println("Testing Status : " + scenario.getStatus());
		System.out.println("");
		System.out.println(scenario.getStatus() + " Screenshot for " + ScenarioName + " Scenario is captured");
		System.out.println("");

		System.out.println("Testing Ended at : " + currentDate);
		System.err.println("");

		Server.driverQuit();
		System.out.println(" . . . . .     End Appium Server      .   . . . .");
		Server.service.stop();
		
		 if (ConfigFileReader.getScreenrecord().contains("True")) {
		 
		  MyScreenRecorder.stopRecording();
		 System.out.println("Screen Recording Stoped");
		 System.out.println(""); }
		 
	}

}
