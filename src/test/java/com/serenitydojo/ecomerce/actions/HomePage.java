package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class HomePage extends UIInteractions {

    @Step("Name the Page Home")
    public String TitlePage(){
        return getTitle();
    }
}
