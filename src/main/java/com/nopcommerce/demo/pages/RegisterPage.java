package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.Logger;

public class RegisterPage extends Utility {

   private static final Logger log =Logger.getLogger(RegisterPage.class.getName());

   public RegisterPage(){
       PageFactory.initElements(driver,this);

   }
   @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMassage;

   @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement regButton;

   @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement>fieldValidationError;

   @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement selectGender;

   @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFname;

   @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLname;

   @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement selectday;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement selectmonth;

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement selectyear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enteremailr;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordr;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpasswordr;





    public String getErrorMessage() {
        return getTextFromElement(errorMassage);
    }

    public void ClickRegisterButton()
    {
        clickOnElement(regButton);

    }
    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message :fieldValidationError) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                break;
            }
        }
        return validationMessage;
    }
    public void selectGenderf()
    {
        clickOnElement(selectGender);

    }
    public void EnterFirstName()
    {
        sendTextToElement(enterFname,"ketty");

    }
    public void EnterLastName()
    {
        sendTextToElement(enterLname,"xyz");
    }
    public void SelectDayBirthday()
    {
        selectByValueFromDropDown(selectday,"12");
    }
    public void SelectMonthBirthday()
    {
        selectByValueFromDropDown(selectmonth,"6");
    }
    public void SelectYearBirthday()
    {
        selectByValueFromDropDown(selectyear,"1995");
    }
    public void EnterEmail()
    {
        sendTextToElement(enteremailr,"ketty");
    }
    public void EnterPassword()
    {
        sendTextToElement(passwordr,"123456");
    }
    public void EnterConfirmPassword()
    {
        sendTextToElement(confirmpasswordr,"123456");
    }
}
