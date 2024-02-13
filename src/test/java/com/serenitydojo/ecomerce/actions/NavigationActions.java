package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigationActions extends UIInteractions {

    @Step
    public void openTheLumaApplicacion(){
        openUrl("https://magento.softwaretestingboard.com/");
    }
}
