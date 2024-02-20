package com.serenitydojo.ecomerce.acceptancetest.newsletters;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.actions.OpenUrl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

@ExtendWith(SerenityJUnit5Extension.class)
public class SubscribingToANewslettersTest extends UIInteractions {

    @Test
    public void shouldDeAbleToSubcribeWithAvalidEmail(){
    openUrl("https://magento.softwaretestingboard.com/");
    //find(By.className("action showcart")).click();
    }

}
