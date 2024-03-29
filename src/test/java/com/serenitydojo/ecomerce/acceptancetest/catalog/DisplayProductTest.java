package com.serenitydojo.ecomerce.acceptancetest.catalog;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayProductTest extends UIInteractions {

    @Test
    void shouldBeAbleToShowProductTheProductDEtailsPAgeFromTheCatalog(){

        openUrl("https://magento.softwaretestingboard.com/");

        find(By.linkText("Hero Hoodie")).click();

        String productTitle = find(By.className("page-title")).getText();

        assertThat(productTitle).isEqualTo("Hero Hoodie");


    }

    @Test
    void shouldShowPromoCollectionProductDetails(){

        openUrl("https://magento.softwaretestingboard.com/");

        find(By.partialLinkText("New Luma Yoga Collection")).click();

        String productTitle = find(By.className("page-title")).getText();

        assertThat(productTitle).isEqualTo("New Luma Yoga Collection");


    }
}
