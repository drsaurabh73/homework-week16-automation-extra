package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//p[@id='product_reference']//span")
    WebElement modeltext;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    // clear qty
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement clearQuantity;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addtocart;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement close;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
    WebElement proceedtocheckout;

    public String getModelText() {
        return getTextFromElement(modeltext);
    }

    public void setClearQuantity() {
        clearTextToElement(clearQuantity);// clear quantity
    }

    public void setChangeQuantity(String text) {
        sendTextToElement(clearQuantity, text);
    }

    public void clickOnCart() {
        clickOnElement(addtocart);
    }

    public void clickOnClose() {
        clickOnElement(close);
    }

    public void setProceedtocheckout(){
        clickOnElement(proceedtocheckout);
    }

}
