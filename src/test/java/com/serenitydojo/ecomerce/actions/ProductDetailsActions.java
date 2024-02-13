package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.core.steps.UIInteractions;

public class ProductDetailsActions extends UIInteractions {

    public String getProductTitle(){
        return $(".page-title").getText();
    }

}
