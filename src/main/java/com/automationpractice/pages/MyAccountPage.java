package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement myaddressbutton;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='last_item item box']//li")
    List<WebElement> myaddressdetails;

    @CacheLookup  ////header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dresses;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement casualdresses;

    @CacheLookup ////body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printeddress;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedshortsleev;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement tops;


    public void slectCategory(String text) {
        if (text.equalsIgnoreCase("DRESSES")) {
            clickOnElement(dresses);
        }
        if (text.equalsIgnoreCase("WOMEN")){
            clickOnElement(women);
    }

}


    public void setMyaddressbutton() {
        clickOnElement(myaddressbutton);
    }

    public void setSubCategory(String text) {
        if (text.equalsIgnoreCase("Casual Dresses")) {
            clickOnElement(casualdresses);
        }
        if (text.equalsIgnoreCase("Tops")) {
            clickOnElement(tops);
        }

    }


    public void selectProduct(String text) {
        if (text.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(printeddress);
        }
        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            clickOnElement(fadedshortsleev);
        }
    }


    public String[] getAddressText() {
        String[] a = new String[8];
        for (int i = 3; i < myaddressdetails.size() - 1; i++) {
            String b = myaddressdetails.get(i).getText();
            a[i - 3] = b;
        }
        return a;
    }

}
