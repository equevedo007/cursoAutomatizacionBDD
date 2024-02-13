package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

public class CatalogActions extends UIInteractions {

    @Step("Show Product Detail for '{0}'")
    public void shouldProductDetail(String ProductName){
        find(By.linkText(ProductName)).click();
    }
}
