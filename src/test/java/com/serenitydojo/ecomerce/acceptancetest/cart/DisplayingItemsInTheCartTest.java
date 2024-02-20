package com.serenitydojo.ecomerce.acceptancetest.cart;

import com.serenitydojo.ecomerce.pageobject.HotSellersComponent;
import com.serenitydojo.ecomerce.pageobject.LunaHomePage;
import com.serenitydojo.ecomerce.pageobject.ProductDetailPage;
import com.serenitydojo.ecomerce.pageobject.ShoppingCartComponent;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayingItemsInTheCartTest extends UIInteractions {

    LunaHomePage lunaHome;
    ShoppingCartComponent shoppingCartComponent;
    HotSellersComponent hotSellersComponent;
    ProductDetailPage productDetailPage;

    @Test
    void shouldDisplayNoItemsNoIteamsMessageifCartIsEmpty(){

        lunaHome.open();
        find(By.className("showcart")).click();
        shoppingCartComponent.showCartSumary();
        waitForTextToAppear("You have no items in your shopping cart.");
    }

    @Test
    void ShouldBeAbleToAddSingleItemTotheCart(){
        lunaHome.open();
      //  hotSellersComponent.SelectItem("Push It Messenger Bag");
        hotSellersComponent.SelectItem("Radiant Tee");
        hotSellersComponent.SelectSize("XS");
        hotSellersComponent.SelectColor("Blue");
        productDetailPage.addToCart();
        shoppingCartComponent.showCartSumary();
        List<String> itemsInTheCart = shoppingCartComponent.getItems();

        for (String item : itemsInTheCart) {

            System.out.println("Edinson"+item);
        }

       // assertThat(itemsInTheCart).contains("Radiant Tee");

    }
}
