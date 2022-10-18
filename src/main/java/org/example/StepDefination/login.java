package org.example.StepDefination;

import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Locators.locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.nio.file.LinkOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class login
{
    @Given("launch the site")
    public void launch_the_site() {
        DriverAction.navigateToUrl("https://demoqa.com/login");
    }
    @Then("Enter the {string} in Username field")
    public void enter_the_in_username_field(String uname) throws InterruptedException {
        //DriverAction.getElement(By.xpath("//input[@id='userName']"));
        DriverAction.typeText(locators.username,uname);
        //Thread.sleep(50000);
    }
    @Then("Enter the {string} in Password field")
    public void enter_the_in_password_field(String pwd) {

        DriverAction.typeText(locators.password,pwd);
    }
    @Then("Click on Login Button")
    public void click_on_login_button() throws InterruptedException
    {
        DriverAction.pageScroll(0,200,true);
        DriverAction.getElement(locators.login_buttn).click();

        Thread.sleep(5000);
    }

    @Then("Click on NewUser Button")
    public void click_on_new_user_button() {
        DriverAction.pageScroll(0,200,true);
        DriverAction.getElement(locators.Register_buttn).click();
    }
    @Then("Enter First Name in {string}")
    public void enter_first_name_in(String firstname) {
        DriverAction.typeText(locators.firstname,firstname);
    }
    @Then("Enter Last Name in {string}")
    public void enter_last_name_in(String lastname) {
        DriverAction.typeText(locators.lastname,lastname);
    }
    @Then("Enter UserName in {string}")
    public void enter_user_name_in(String uname) {
        DriverAction.typeText(locators.username,uname);
    }
    @Then("Enter Password in {string}")
    public void enter_password_in(String pwd) {
        DriverAction.typeText(locators.password,pwd);
    }
    @Then("Click On Captcha")
    public void click_on_captcha() throws InterruptedException
    {
        //DriverAction.switchToFrame(0);
        DriverAction.pageScroll(0,200,true);
        WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        wait.until(ExpectedConditions.elementToBeClickable(

                By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
    }
    @Then("Click on Register Button.")
    public void click_on_register_button() throws InterruptedException
    {
        DriverAction.pageScroll(0,600,true);
        DriverAction.switchToDefaultContent();
        DriverManager.getWebDriver().findElement(locators.register).click();
        DriverAction.waitSec(2);
    }
    @Then("Click on Ok and Verify the Sucess {string}")
    public void click_on_ok_and_verify_the_sucess(String string) {
        //WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), 2);
        WebDriverWait wait1=new WebDriverWait(DriverManager.getWebDriver(),Duration.ofSeconds(2));
        wait1.until(ExpectedConditions.alertIsPresent());
        Alert a = DriverManager.getWebDriver().switchTo().alert();
        String s = a.getText();
        System.out.println("Alert text is: " + s);
        a.accept();
    }

    @Then("Search the book {string} in searchbox")
    public void search_the_book_in_searchbox(String value) throws InterruptedException {
        DriverAction.getElement(locators.searchBox).sendKeys(value);
        Thread.sleep(40000);
    }
    @Then("Verify the book is displayed after search")
    public void verify_the_book_is_displayed_after_search() {
        WebElement element=DriverAction.getElement(locators.tabledata);
        if(element.getText().equalsIgnoreCase("Git Pocket Guide"))
            System.out.println("Search successfull");
        else
            System.out.println("Search not successfull");
    }
    @Then("Click on Logout Button")
    public void click_on_logout_button() throws InterruptedException {
        DriverAction.getElement(locators.logoutButt).click();
        Thread.sleep(20000);
    }
    @Then("Verify the {string} of Username display after login")
    public void verify_the_of_username_display_after_login(String uname) {
        String val=DriverAction.getElement(locators.userid).getText();
        System.out.println(val);
        if(val.equalsIgnoreCase(uname))
            System.out.println("Login Successfully");

    }
    @Then("Click on GoStrore Button")
    public void click_on_go_strore_button() {
        DriverAction.pageScroll(0,700,true);
        DriverAction.getElement(locators.gostore).click();
    }
    @Then("Click on any book Title")
    public void click_on_any_book_title() throws InterruptedException{
        DriverAction.pageScroll(0,150,true);
        List<WebElement> ele=DriverAction.getElements(locators.titleBook);
        WebElement val=ele.get(0);
        Thread.sleep(3000);
        val.click();
    }

    @Then("Verify user can see all the info related to book")
    public void verify_user_can_see_all_the_info_related_to_book() throws InterruptedException {
        Boolean isPassed=false;
        DriverAction.getElement(locators.bookWrraper);
        Thread.sleep(2000);
    }
    @Then("Click On the link for more info.")
    public void click_on_the_link_for_more_info() throws InterruptedException {
        DriverAction.pageScroll(0,700,true);
        DriverAction.getElement(locators.link_book).click();
        Thread.sleep(30000);
    }
    @Then("Close the browser.")
    public void close_the_browser() {
        DriverAction.closeCurrentTab();
    }
    @Then("User can click on Back to Book Store Button.")
    public void user_can_click_on_back_to_book_store_button() {
        DriverAction.getElement(locators.back_button).click();
    }
    @Then("Verify the Headers of the columns for  Book Store table")
    public void verify_the_headers_of_the_columns_for_book_store_table() {
        List<WebElement> header = DriverAction.getElements(locators.header_Column);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < header.size(); i++) {
            list.add(header.get(i).getText());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.contains("Publisher") || list.contains("Image") || list.contains("Title") || list.contains("Author"))
                System.out.println("Checked the headers of Book Store column");
        }
    }

}
