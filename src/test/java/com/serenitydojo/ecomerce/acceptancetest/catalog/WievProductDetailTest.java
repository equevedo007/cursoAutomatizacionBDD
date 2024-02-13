package com.serenitydojo.ecomerce.acceptancetest.catalog;

import com.serenitydojo.ecomerce.actions.CatalogActions;
import com.serenitydojo.ecomerce.actions.NavigationActions;
import com.serenitydojo.ecomerce.actions.ProductDetailsActions;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class WievProductDetailTest extends UIInteractions {

    @Steps
    NavigationActions navigationActions;
    CatalogActions fronThecatalog;
    ProductDetailsActions productDetails;

    @Test
    void shouldDisplayTheProductDetails(){


        navigationActions.openTheLumaApplicacion();

        fronThecatalog.shouldProductDetail("Fusion Backpack");

        Assertions.assertThat(productDetails.getProductTitle()).isEqualTo("Fusion Backpack");



    }
}
