package com.serenitydojo.ecomerce.acceptancetest.catalog;

import com.serenitydojo.ecomerce.acceptancetest.navigation.NavigationActions;
import com.serenitydojo.ecomerce.actions.SearchActions;
import com.serenitydojo.ecomerce.actions.SearchResultPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import org.junit.jupiter.api.Test;


public class SearchTest extends UIInteractions {

    @Steps
    NavigationActions  navigation;
    @Steps
    SearchActions search;
    SearchResultPage searchResultPage;

    @Test
    void shouldDisplayTheSearchResults(){

        navigation.OpenTheLumaApplication();
        search.forProduct("Hero Hoobie");
        String ResultTitle = searchResultPage.getSearchResultTitle();
    }
}
