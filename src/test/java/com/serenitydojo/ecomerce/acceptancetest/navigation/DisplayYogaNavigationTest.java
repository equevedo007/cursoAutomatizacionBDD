package com.serenitydojo.ecomerce.acceptancetest.navigation;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class DisplayYogaNavigationTest extends UIInteractions {



    @Test
    void Test001(){
        openUrl("https://magento.softwaretestingboard.com/");

        //find("//span[.='Shop New Yoga']").click();

        find(Button.withText("Shop New Yoga")).click();

       String msn= find("//h1[@id='page-title-heading']").getText();
        System.out.println("El Mensaje es : "  + msn);

        assertThat(msn).isEqualTo("New Luma Yoga Collection");


    }

    @Test
    void Test002(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(By.id("search")).typeAndEnter("Hero Hoodie");
        String msg = find(By.className("base")).getText();

        System.out.println("El Mensaje es : " + msg);


    }


}
