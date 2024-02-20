package com.serenitydojo.ecomerce.pageobject;

import net.serenitybdd.core.pages.PageComponent;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCartComponent extends PageComponent {

    @FindBy(css = ".showcart")
    WebElementFacade showCartButton;

    @FindBy(css = "#mini-cart .product-item-name")
    List<WebElementFacade> items;


    public void showCartSumary() {
        showCartButton.click();
    }

    public List<String> getItems(){
        return findAll("#mini-cart .product-item-name").texts();
        //return items.stream().map(items -> items.getText()).collect(Collectors.toList());
    }


}
