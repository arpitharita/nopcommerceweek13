package com.nopcommerce.demo.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ComputerPage extends Utility {
    private final Logger log = LogManager.getLogManager().getLogger(LoginPage.class.getName());

    public ComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[1]/a")
    WebElement computerText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks ")
    WebElement notebookLink;

}
