package com.serenitydojo.ecomerce.acceptancetest.navigation;

import com.serenitydojo.ecomerce.actions.HomePage;
import com.serenitydojo.ecomerce.actions.MenuBarActions;
import com.serenitydojo.ecomerce.actions.NavigationActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class MenuBarTest extends UIInteractions {

    @Steps
    NavigationActions navigationActions;
    @Steps
    MenuBarActions menuBarActions;
    @Steps
    HomePage homePage;

    @Test
    public void shouldDisplayTheCorrectTitle(){
        navigationActions.openTheLumaApplicacion();
        Assertions.assertThat(homePage.TitlePage()).isEqualTo("Home Page");
    }

    @Test
    void shouldShowTheTopLevelMenuItemsOnTheHomePage() {
        navigationActions.openTheLumaApplicacion();
        Assertions.assertThat(menuBarActions.topLeveMenuItems()).contains("What's New","Women","Men","Gear","Training","Sale");
    }
}
