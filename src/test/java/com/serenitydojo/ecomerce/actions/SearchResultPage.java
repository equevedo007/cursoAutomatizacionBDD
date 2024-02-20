package com.serenitydojo.ecomerce.actions;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class SearchResultPage extends PageObject {
    @Step
    public String getSearchResultTitle() {
        return $(".page-title").getText();
    }
}
