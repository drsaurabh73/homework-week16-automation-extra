package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement regemail;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement  regpassword;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signinbutton;


    public void setRegemail(String text) {
        sendTextToElement(regemail, text);
    }
    public void setRegpassword(String text) {
        sendTextToElement(regpassword, text);
    }
    public void clickOnSignin() {
        clickOnElement(signinbutton);
    }
}
