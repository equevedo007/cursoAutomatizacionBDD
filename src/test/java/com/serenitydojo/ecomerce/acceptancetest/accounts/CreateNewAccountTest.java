package com.serenitydojo.ecomerce.acceptancetest.accounts;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.ui.Button;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class CreateNewAccountTest extends UIInteractions {

    @Test
    void CreateNewAccount(){
        openUrl("https://magento.softwaretestingboard.com/");

        find(By.linkText("Create an Account")).click();
        find(By.id("firstname")).type("Edinson");
        find(By.id("lastname")).type("Edinson");
        find(By.id("password")).type("quevedo.edinson@gmail.com");
        find(By.cssSelector("input#email_address")).type("quesvedo.edinson@gmail.com");
        find(By.id("password-confirmation")).type("P@ssw0rd86Edinson86");
        find(Button.withText("Create an Account")).click();

       // String Mensaje = find(By.xpath("//div[contains(text(),'Thank you for registering with Main Website Store.')]")).getText();

     //   assertThat(Mensaje).isEqualTo("Thank you for registering with Main Website Store.") ;

    }

    @Test
    public void Test001(){

        openUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        find(By.cssSelector("input[class=\"cdx-text-input__input\"]")).typeAndEnter("Alfonso Ugarte");

    }


}
