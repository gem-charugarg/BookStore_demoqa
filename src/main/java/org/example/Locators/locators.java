package org.example.Locators;

import org.openqa.selenium.By;

public class locators
{
    public static By username= By.xpath("//input[@id='userName']");
    public static By password= By.xpath("//input[@id='password']");
    public static By login_buttn=By.xpath("//button[@id='login']");
    public static By Register_buttn=By.xpath("//button[@id='newUser']");
    public static  By firstname=By.xpath("//input[@id='firstname']");
    public static By lastname=By.xpath("//input[@id='lastname']");
    public static By captcha=By.xpath("//div[@class='recaptcha-checkbox-checkmark']");


    public static By register=By.xpath("//button[@id='register']");
    public static By searchBox=By.xpath("//input[@id='searchBox']");
    public static By tabledata=By.xpath("//a[contains(text(),'Git Pocket Guide')]");
    public  static By logoutButt=By.xpath("//button[@id='submit']");
    public static By userid=By.xpath("//label[@id='userName-value']");
    public static By gostore=By.xpath("//button[@id='gotoStore']");
    public static By titleBook=By.xpath("//span[@class='mr-2']");
    public  static By bookWrraper=By.xpath("//div[@class='books-wrapper']");
    public static By link_book=By.xpath("(//label[@id='userName-value'])[8]");
    public static By back_button=By.xpath("//button[@id='addNewRecordButton']");
    public static By header_Column=By.xpath("//div[@class='rt-resizable-header-content']");
    public static By Form_fname=By.xpath("//input[@placeholder='First Name']");
    public static By Form_lname=By.xpath("//input[@placeholder='Last Name']");
    public static By Form_email=By.xpath("//input[@placeholder='name@example.com']");
    public static By Form_pno=By.xpath("//input[@id='userNumber']");
    public static By f_radio=By.xpath("//input[@id='gender-radio-1']");
    public static By dateSelect=By.xpath("//div[@class='react-datepicker__day react-datepicker__day--022']");
    public static By dob=By.xpath("//input[@id='dateOfBirthInput']");
    public static By sub=By.xpath("//div[@id='subjectsContainer']");
    public static By hobby=By.xpath("//label[@for='hobbies-checkbox-3']");


}

