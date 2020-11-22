package com.wpKiwiSaveCalcTest.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class wpKiwiSaverCalcTestPOM {
	private WebDriver webDriver;
	private Duration uiWaitDuration;
	private final long defaultWaitDuration=5;
	//private Properties pageProp;
	//private FileInputStream inPropFile;
	
	// Head Pages
	@FindBy(id="ubermenu-section-link-kiwisaver-ps")
	WebElement kiwiSaverLink;
	@FindBy(css="a#ubermenu-item-cta-kiwisaver-calculators-ps")
	WebElement kiwiSaverCalcButton;
	@FindBy(id="sidenav-responsive-children-title-4825-ps")
	WebElement kiwiSaverCalcMainLink;
	@FindBy(id="responsive-children-title-3956-ps")
	WebElement kiwiSaverCalcSubLink;
		
	// KiwiSaver Calculator Page
	@FindBy(id="calculator-embed")
	WebElement kiwiSaverCalcContent;
	@FindBy(css="div.calculator-embed>iframe")
	WebElement kiwiSaverCalcIFrame;
	
	@FindBy(css="div[label='Current age'] input")
	WebElement calcAgeInput;
	@FindBy(css="div[label='Current age'] div.message-row p")
	WebElement calcAgeTipText;
	@FindBy(css="div[label='Current age'] div.field-info i")
	WebElement calcAgeInfoIcon;
	
	@FindBy(css="div[label='Employment status'] div.control-well")
	WebElement calcEmploymentStatusInput;
	@FindBy(css="div[label='Employment status'] ul.option-list li[value='employed']")
	WebElement calcEmploymentStatusEmployed;
	@FindBy(css="div[label='Employment status'] ul.option-list li[value='self-employed']")
	WebElement calcEmploymentStatusSelfEmployed;
	@FindBy(css="div[label='Employment status'] ul.option-list li[value='not-employed']")
	WebElement calcEmploymentStatusNotEmployed;
	@FindBy(css="div[label='Employment status'] div.message-row p")
	WebElement calcEmploymentStatusTipText;
	@FindBy(css="div[label='Employment status'] div.field-info i")
	WebElement calcEmploymentStatusInfoIcon;
	
	@FindBy(css="div[label='Salary or wages per year (before tax)'] input")
	WebElement calcAnnualSalInput;
	@FindBy(css="div[label='Salary or wages per year (before tax)'] div.message-row p")
	WebElement calcAnnualSalTipText;
	@FindBy(css="div[label='Salary or wages per year (before tax)'] div.field-info i")
	WebElement calcAnnualSalInfoIcon;
		
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group")
	WebElement calcContributeRateRadioSel;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group div.radio-control[value='3']")
	WebElement calcContributeRateRadioSel3Percent;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group div.radio-control[value='4']")
	WebElement calcContributeRateRadioSel4Percent;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group div.radio-control[value='6']")
	WebElement calcContributeRateRadioSel6Percent;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group div.radio-control[value='8']")
	WebElement calcContributeRateRadioSel8Percent;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.radio-group div.radio-control[value='10']")
	WebElement calcContributeRateRadioSel10Percent;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.message-row p")
	WebElement calcContributeRateTipText;
	@FindBy(css="div[label='KiwiSaver member contribution'] div.field-info i")
	WebElement calcContributeRateInfoIcon;
		
	@FindBy(css="div[label='Current KiwiSaver balance'] input")
	WebElement calcCurBalInput;
	@FindBy(css="div[label='Current KiwiSaver balance'] div.message-row p")
	WebElement calcCurBalTipText;
	@FindBy(css="div[label='Current KiwiSaver balance'] div.field-info i")
	WebElement calcCurBalInfoIcon;
		
	@FindBy(css="div[label='Voluntary contributions'] input")
	WebElement calcVolContriInput;
	@FindBy(css="div[label='Voluntary contributions'] div.select-control div.control-well")
	WebElement calcVolContriFreqInput;
	@FindBy(css="div[label='Voluntary contributions'] ul.option-list li[value='week']>div")
	WebElement calcVolContriFreqWeek;
	@FindBy(css="div[label='Voluntary contributions'] ul.option-list li[value='fortnight']>div")
	WebElement calcVolContriFreqFortnight;
	@FindBy(css="div[label='Voluntary contributions'] ul.option-list li[value='month']>div")
	WebElement calcVolContriFreqMonth;
	@FindBy(css="div[label='Voluntary contributions'] ul.option-list li[value='year']>div")
	WebElement calcVolContriFreqYear;
	@FindBy(css="div[label='Voluntary contributions'] div.message-row p")
	WebElement calcVolContriTipText;
	@FindBy(css="div[label='Voluntary contributions'] div.field-info i")
	WebElement calcVolContriInfoIcon;
	
	@FindBy(css="div[label='Risk profile'] div.radio-group")
	WebElement calcRiskProfileRadioSel;
	@FindBy(css="div[label='Risk profile'] div.radio-group div.radio-control[value='low']")
	WebElement calcRiskProfileRadioSelDefensive;
	@FindBy(css="div[label='Risk profile'] div.radio-group div.radio-control[value='medium']")
	WebElement calcRiskProfileRadioSelConservative;
	@FindBy(css="div[label='Risk profile'] div.radio-group div.radio-control[value='high']")
	WebElement calcRiskProfileRadioSelBalanced;
	@FindBy(css="div[label='Risk profile'] div.radio-group div.radio-control[value='growth']")
	WebElement calcRiskProfileRadioSelGrowth;
	@FindBy(css="div[label='Risk profile'] div.message-row p")
	WebElement calcRiskProfileTipText;
	@FindBy(css="div[label='Risk profile'] div.field-info i")
	WebElement calcRiskProfileInfoIcon;
	
	@FindBy(css="button.btn>span.label[ng-show='!ctrl.data.formCompleted'")
	WebElement viewKiwiSaverResultNotReady;
	@FindBy(css="button.btn>span.label[ng-show='ctrl.data.formCompleted'")
	WebElement viewKiwiSaverResultReady;
	
	@FindBy(css="div[label='Savings goal at retirement'] input")
	WebElement calcSavingGoalInput;
	@FindBy(css="div[label='Savings goal at retirement'] div.message-row p")
	WebElement calcSavingGoalTipText;
	@FindBy(css="div[label='Savings goal at retirement'] div.field-info i")
	WebElement calcSavingGoalInfoIcon;
	
	public void browseToCalcPage() throws TimeoutException
	{
		this.kiwiSaverLink.click();
		new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.kiwiSaverCalcButton));
		this.kiwiSaverCalcButton.click();
		new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.kiwiSaverCalcMainLink));
		this.kiwiSaverCalcMainLink.click();
		new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.kiwiSaverCalcSubLink));
		this.kiwiSaverCalcSubLink.click();
		new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.visibilityOf(this.kiwiSaverCalcContent));
		this.webDriver.switchTo().frame(kiwiSaverCalcIFrame);
	}
	
	public void inputUserCurAge(String inputAge) {
		this.calcAgeInput.sendKeys(inputAge);
	}
	
	public void inputEmploymentStatus(String employStatus) throws TimeoutException{
		switch(employStatus)
		{
			case "Employed":
				this.calcEmploymentStatusInput.click();
				this.calcEmploymentStatusEmployed.click();
				break;
			case "Self-employed":
				this.calcEmploymentStatusInput.click();
				this.calcEmploymentStatusSelfEmployed.click();
				break;
			case "Not employed":
				this.calcEmploymentStatusInput.click();
				this.calcEmploymentStatusNotEmployed.click();
				break;
		}
	}
	
	public void inputAnnualWage(String inputWage) {
		this.calcAnnualSalInput.sendKeys(inputWage);
	}
	
	
	public void inputContributionRate(String contributePercent) {
		if (this.calcContributeRateRadioSel.isDisplayed())
		{
			switch(contributePercent)
			{
				case "3%":
					this.calcContributeRateRadioSel3Percent.click();
					break;
				case "4%":
					this.calcContributeRateRadioSel4Percent.click();
					break;
				case "6%":
					this.calcContributeRateRadioSel6Percent.click();
					break;
				case "8%":
					this.calcContributeRateRadioSel8Percent.click();
					break;
				case "10%":
					this.calcContributeRateRadioSel10Percent.click();
					break;
			}
		}
	}
	
	public void inputCurBal(String inputBalance) {
		this.calcCurBalInput.sendKeys(inputBalance);
	}
	
	public void inputVoluntaryContribution(String inputContribution, String contributeFreq) throws TimeoutException{
		this.calcVolContriInput.sendKeys(inputContribution);
		switch(contributeFreq)
		{
			case "Weekly":
				this.calcVolContriFreqInput.click();
				//new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.calcVolContriFreqWeek));
				this.calcVolContriFreqWeek.click();
				break;
			case "Fortnightly":
				this.calcVolContriFreqInput.click();
				//new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.calcVolContriFreqFortnight));
				this.calcVolContriFreqFortnight.click();
				break;
			case "Monthly":
				this.calcVolContriFreqInput.click();
				//new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.calcVolContriFreqMonth));
				this.calcVolContriFreqMonth.click();
				break;
			case "Annually":
				this.calcVolContriFreqInput.click();
				//new WebDriverWait(this.webDriver, this.uiWaitDuration).until(ExpectedConditions.elementToBeClickable(this.calcVolContriFreqYear));
				this.calcVolContriFreqYear.click();
				break;
		}
	}
	
	public void inputRiskProfile(String riskProfile) {
		switch(riskProfile)
		{
			case "Denfensive":
				this.calcRiskProfileRadioSelDefensive.click();
				break;
			case "Conservative":
				this.calcRiskProfileRadioSelConservative.click();
				break;
			case "Balanced":
				this.calcRiskProfileRadioSelBalanced.click();
				break;
			case "Growth":
				this.calcRiskProfileRadioSelGrowth.click();
		}
	}
	
	public void inputSavingGoal(String inputGoal) {
		this.calcSavingGoalInput.sendKeys(inputGoal);
	}
	
	public boolean checkResultAvailable() {
		return this.viewKiwiSaverResultReady.isDisplayed();
	}
	public void clickInfoIcon(String fieldType) throws InterruptedException
	{
		this.getInfoIcon(fieldType).click();
	}
	
	public WebElement getInput(String fieldType)
	{
		WebElement msgBox = null;
		
		switch(fieldType)
		{
			case "CurrentAge":
				msgBox = this.calcAgeInput;
				break;
			case "EmploymentStatus":
				msgBox = this.calcEmploymentStatusInput;
				break;
			case "CurrentKiwiSaverBalance":
				msgBox = this.calcCurBalInput;
				break;
			case "VoluntaryContribution":
				msgBox = this.calcVolContriInput;
				break;
			case "RiskProfile":
				msgBox = this.calcRiskProfileRadioSel;
				break;
			case "SavingGoal":
				msgBox = this.calcSavingGoalInput;
				break;
		}
		return msgBox;
	}
	
	public WebElement getMsgBox(String fieldType)
	{
		WebElement msgBox = null;
		
		switch(fieldType)
		{
			case "CurrentAge":
				msgBox = this.calcAgeTipText;
				break;
			case "EmploymentStatus":
				msgBox = this.calcEmploymentStatusTipText;
				break;
			case "CurrentKiwiSaverBalance":
				msgBox = this.calcCurBalTipText;
				break;
			case "VoluntaryContribution":
				msgBox = this.calcVolContriTipText;
				break;
			case "RiskProfile":
				msgBox = this.calcRiskProfileTipText;
				break;
			case "SavingGoal":
				msgBox = this.calcSavingGoalTipText;
				break;
		}
		return msgBox;
	}
	
	private WebElement getInfoIcon(String fieldType)
	{
		WebElement infoIcon = null;
		
		switch(fieldType)
		{
			case "CurrentAge":
				infoIcon = this.calcAgeInfoIcon;
				break;
			case "EmploymentStatus":
				infoIcon = this.calcEmploymentStatusInfoIcon;
				break;
			case "CurrentKiwiSaverBalance":
				infoIcon = this.calcCurBalInfoIcon;
				break;
			case "VoluntaryContribution":
				infoIcon = this.calcVolContriInfoIcon;
				break;
			case "RiskProfile":
				infoIcon = this.calcRiskProfileInfoIcon;
				break;
			case "SavingGoal":
				infoIcon = this.calcSavingGoalInfoIcon;
				break;
		}
		return infoIcon;
	}
	
	public wpKiwiSaverCalcTestPOM(WebDriver driver, String siteUnderTest) throws IOException
	{
		this.webDriver = driver;
		driver.get(siteUnderTest);
		this.uiWaitDuration = Duration.ofSeconds(defaultWaitDuration);
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		//PageFactory.initElements(factory, this);
		PageFactory.initElements(driver, this);
	}
}
