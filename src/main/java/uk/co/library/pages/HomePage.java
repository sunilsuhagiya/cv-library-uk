package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

import java.util.HashMap;
import java.util.Map;


public class HomePage extends Utility {
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;


    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter Job Title " + jobTitleField.toString());
        sendTextToElement(jobTitleField, jobTitle);
        //CustomListeners.test.log(Status.PASS, "Enter user name " + jobTitle);
    }


    public void iFrame() {
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptPrivacy);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptPrivacy;


    public void enterLocation(String location) {
        Reporter.log("Enter Location " + locationField.toString());
        sendTextToElement(locationField, location);
    }


    public void selectDistance(String distance) {
        Reporter.log("Select Distance " + locationField.toString());
        sendTextToElement(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Enter Location " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
        CustomListeners.test.log(Status.PASS, "Enter Location ");

    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Min Salary " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Enter Min Salary " + minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Maz Salary " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter Max Salary " + maxSalary);

    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select Salary Type " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        CustomListeners.test.log(Status.PASS, "Select Salary Type" + sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select Job Type " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        CustomListeners.test.log(Status.PASS, "Select Job Type" + jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on Find Jobs Button " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
        CustomListeners.test.log(Status.PASS, "Click on Find Jobs Button");
    }
}
