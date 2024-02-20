package com.serenitydojo.ecomerce.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends PageObject {

    @FindBy(id = "product-addtocart-button")
    WebElementFacade addToCartButton;

    @FindBy(xpath = "//span[contains(text(),'items')]")
    WebElementFacade spinner;

    @FindBy(xpath = "//button[@data-role='proceed-to-checkout']")
    WebElementFacade btnProceedtoCheckout;

    public void addToCart(){
        addToCartButton.click();
        //spinner.waitUntilVisible();
        spinner.waitUntilNotVisible();


    }


}
