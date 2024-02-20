package com.serenitydojo.ecomerce.pageobject;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ui.Image;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class HotSellersComponent extends PageComponent {

    public void SelectItem(String ItemName){
        find(Image.withAltText(ItemName)).click();

    }

    public void SelectSize(String Size){
        find(By.cssSelector("div[option-label='"+Size+"']")).click();

    }

    public void SelectColor(String Color){
        find(By.cssSelector("div[option-label='"+Color+"']")).click();
    }


}
