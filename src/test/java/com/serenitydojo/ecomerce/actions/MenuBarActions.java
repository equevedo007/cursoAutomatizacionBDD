package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.List;

public class MenuBarActions extends UIInteractions {

    @Step("Read The Top Level Menu")
    public List<String> topLeveMenuItems(){
        return findAll(".navigation a.level-top").texts();
    }
}
