package org.example.StepDefination;

import com.gemini.generic.ui.utils.DriverManager;
import com.gemini.generic.ui.utils.DriverAction;
import io.cucumber.java.en.Then;
import org.example.Locators.locators;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.dom.DOM;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.LinkOption;
import java.time.Duration;

public class Form
{
    @Then("Enter the {string} in First Name.")
    public void enter_the_in_first_name(String fname) {
        WebElement ele=DriverAction.getElement(locators.Form_fname);
        ele.sendKeys(fname);
    }

    @Then("Enter the {string} in Last Name.")
    public void enter_the_in_last_name(String lname) {
        WebElement ele=DriverAction.getElement(locators.Form_lname);
        ele.sendKeys(lname);
    }
    @Then("Enter the {string} in Email")
    public void enter_the_in_email(String email) {
        WebElement ele=DriverAction.getElement(locators.Form_email);
        ele.sendKeys(email);
    }
    @Then("Enter the {string} in Mobile Number")
    public void enter_the_in_mobile_number(String phnno) throws InterruptedException {
        WebElement ele=DriverAction.getElement(locators.Form_pno);
        ele.sendKeys(phnno);
        Thread.sleep(20000);
    }
    @Then("Choose the Gender")
    public void choose_the_gender() throws InterruptedException {

        //WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(25));
        //wait.until(ExpectedConditions.elementToBeClickable(locators.f_radio));
        WebElement ele = DriverManager.getWebDriver().findElement(By.xpath("//input[@id='gender-radio-1']"));
        ele.click();
        Thread.sleep(2000);

    }
    @Then("Select the value from Calendar")
    public void select_the_value_from_calendar()
    {
        DriverAction.pageScroll(0, 200, true);
        WebElement ele=DriverAction.getElement(locators.dob);
        WebElement DOB=DriverAction.getElement(locators.dateSelect);
        DOB.click();
    }

    @Then("Enter the {string} in subjects")
    public void enter_the_in_subjects(String val)
    {
        DriverAction.pageScroll(0, 200, true);
        WebElement ele=DriverAction.getElement(locators.sub);
        ele.sendKeys(val);
    }

    @Then("Choose the Hobbies")
    public void choose_the_hobbies() throws InterruptedException {
        WebElement ele=DriverAction.getElement(locators.hobby);
        ele.click();
        System.out.println(ele.getText());
        Thread.sleep(20000);

    }


    }
