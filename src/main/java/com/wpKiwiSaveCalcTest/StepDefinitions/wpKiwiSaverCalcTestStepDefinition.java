package com.wpKiwiSaveCalcTest.StepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

import com.wpKiwiSaveCalcTest.PageFactory.wpKiwiSaverCalcTestPOM;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


public class wpKiwiSaverCalcTestStepDefinition {
	private WebDriver webdriver;
	private com.wpKiwiSaveCalcTest.PageFactory.wpKiwiSaverCalcTestPOM kiwiSaverCalcTestPOM;
	
	private Properties browseProp;
	private FileInputStream inPropFile;
	
	@Given("^I browse to KiwiSaver Calculator page$")
	public void browseKiwiSaverCalcPage() throws Throwable{
		this.kiwiSaverCalcTestPOM.browseToCalcPage();
	}
	
	@When("^I click infomation icon for (CurrentAge|EmploymentStatus|CurrentKiwiSaverBalance|VoluntaryContribution|RiskProfile|SavingGoal) field$")
	public void clickInfoIcon(String fieldType) throws Throwable{
		this.kiwiSaverCalcTestPOM.clickInfoIcon(fieldType);
	}
	
	@Then ("^Message is displayed for (CurrentAge|EmploymentStatus|CurrentKiwiSaverBalance|VoluntaryContribution|RiskProfile|SavingGoal) field$")
	public void checkMsgDisplay(String fieldType) throws Throwable{
		WebElement msgBox = this.kiwiSaverCalcTestPOM.getMsgBox(fieldType);
		
		Assert.assertTrue(msgBox.isDisplayed(), "Message box for " + fieldType + "should be displayed");
	}
	
	@And ("^Message is displayed (above|below) input box for (CurrentAge|EmploymentStatus|CurrentKiwiSaverBalance|VoluntaryContribution|RiskProfile|SavingGoal) field$")
	public void checkMsgBoxPos(String relativePos, String fieldType) throws Throwable{
		WebElement msgBox = this.kiwiSaverCalcTestPOM.getMsgBox(fieldType);
		WebElement inputBox = this.kiwiSaverCalcTestPOM.getInput(fieldType);
		
		switch(relativePos)
		{
			case "above":
				Assert.assertTrue(msgBox.getLocation().y <= inputBox.getLocation().y, "Message box should be above input box for " + fieldType);
				break;
			case "below":
				Assert.assertTrue(msgBox.getLocation().y >= inputBox.getLocation().y, "Message box should be below input box for " + fieldType);
				break;
		}
	}
	
	@When ("^User inputs Current Age (.*)")
	public void inputCurAge(String inputAge) throws Throwable{
		if (inputAge.length() > 0)
		{
			this.kiwiSaverCalcTestPOM.inputUserCurAge(inputAge);
		}
	}
	
	@And ("^User inputs employment status (Employed|Self-employed|Not employed)")
	public void inputEmpSatus(String inputStatus) throws Throwable{
		this.kiwiSaverCalcTestPOM.inputEmploymentStatus(inputStatus);
	}
	
	@And ("^User inputs Salary/Wage per year (.*)")
	public void inputAnnualSalary(String inputWage) throws Throwable{
		if (inputWage.length()>0)
		{
			this.kiwiSaverCalcTestPOM.inputAnnualWage(inputWage);
		}
	}
	
	@And ("^User inputs contirbution rate (.*)")
	public void inputContributionRate(String inputRate) throws Throwable{
		if (inputRate.length()>0)
		{
			this.kiwiSaverCalcTestPOM.inputContributionRate(inputRate);
		}
	}
	
	@And ("^User inputs Current KiwiSaverBalance (.*)")
	public void inputCurrentBalance(String inputBal) throws Throwable{
		if (inputBal.length()>0)
		{
			this.kiwiSaverCalcTestPOM.inputCurBal(inputBal);
		}
	}
	
	@And ("^User inputs voluntary contribution (.*) with frequency (.*)$")
	public void inputVolContribution(String inputBal, String contributeFreq) throws Throwable{
		if (inputBal.length()> 0)
		{
			this.kiwiSaverCalcTestPOM.inputVoluntaryContribution(inputBal, contributeFreq);
		}
	}
	
	@And ("^User inputs Risk Profile (Defensive|Conservative|Balanced|Growth)$")
	public void inputRiskProfile(String inputProfile) throws Throwable{
		this.kiwiSaverCalcTestPOM.inputRiskProfile(inputProfile);
	}
	
	@And ("^User inputs Saving goal per year (.*)")
	public void inputSavingGoal(String inputGoal) throws Throwable{
		if (inputGoal.length()> 0)
		{
			this.kiwiSaverCalcTestPOM.inputSavingGoal(inputGoal);
		}
	}
	
	@Then ("^KiwiSaver projection result is available$")
	public void checkKiwiSaverResultReady() throws Throwable{
		this.kiwiSaverCalcTestPOM.checkResultAvailable();
	}
	
	@And ("^Message displayed for (CurrentAge|EmploymentStatus|CurrentKiwiSaverBalance|VoluntaryContribution|RiskProfile|SavingGoal) field is \"(.*)\"")
	public void checkMsgBoxContent(String fieldType, String expectedMessage) throws Throwable{
		WebElement msgBox = this.kiwiSaverCalcTestPOM.getMsgBox(fieldType);
		new SoftAssert().assertTrue(expectedMessage.equalsIgnoreCase(msgBox.getText()), "Message Box Text for "+ fieldType + " is not as expected -- EXPECTED=[" + expectedMessage + "] ACTUAL=[" + msgBox.getText() + "]");
		//Assert.assertTrue(expectedMessage.equalsIgnoreCase(msgBox.getText()), "Message Box Text for "+ fieldType + " is not as expected -- EXPECTED=[" + expectedMessage + "] ACTUAL=[" + msgBox.getText() + "]");
	}

	
	@Before
	public void beforeScenario() throws IOException {
		browseProp = new Properties();
		inPropFile = new FileInputStream("config/browse.properties");
		browseProp.load(inPropFile);
		
		System.setProperty("webdriver.gecko.driver", browseProp.getProperty("FireFoxDriverPath"));
		System.setProperty("webdriver.edge.driver", browseProp.getProperty("EdgeDriverPath"));
		this.webdriver = new EdgeDriver();
		//this.webdriver = new FirefoxDriver();
		this.kiwiSaverCalcTestPOM = new wpKiwiSaverCalcTestPOM(webdriver, browseProp.getProperty("siteUnderTest"));
	}
	@After
	public void afterScenario() throws IOException {
		this.webdriver.close();
		inPropFile.close();
	}
}
