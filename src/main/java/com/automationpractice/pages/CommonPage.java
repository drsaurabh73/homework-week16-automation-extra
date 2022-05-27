package com.automationpractice.pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends Utility {
    private static final Logger log = LogManager.getLogger(CommonPage.class.getName());

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[@id='product_1_1_0_687069']/td[2]/p[1]/a[1]")
    WebElement productfadedtshirt;

    @CacheLookup
    @FindBy(xpath = "//small[contains(text(),'SKU : demo_1')]")
    WebElement sku1;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[5]/input[2]")
    WebElement qtysummary;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[@id='product_3_13_0_687069']/td[2]/p[1]/a[1]")
    WebElement productprinteddress;

    @CacheLookup
    @FindBy(xpath = "//small[contains(text(),'SKU : demo_3')]")
    WebElement sku3;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[2]/td[5]/input[2]")
    WebElement qtysummary1;


    public String setProductSummary(String text) {
        if (text.equalsIgnoreCase("Printed Dress")) {
            return getTextFromElement(productprinteddress);
        }
        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            return getTextFromElement(productfadedtshirt);
        }
        return null;
    }

    public String setReferencename(String text) {
        if (text.equalsIgnoreCase("demo_1")) {
            return getTextFromElement(productprinteddress);
        }
        if (text.equalsIgnoreCase("demo_3")) {
            return getTextFromElement(productfadedtshirt);
        }
        return null;
    }
    public String setQuantity(String text) {
        if (text.equalsIgnoreCase("2")) {
            return getTextFromElementByValue(qtysummary,"value");
        }
        if (text.equalsIgnoreCase("3")) {
            return getTextFromElementByValue(productfadedtshirt,"value");
        }
        return null;
    }

}
