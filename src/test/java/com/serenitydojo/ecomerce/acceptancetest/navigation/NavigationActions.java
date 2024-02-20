package com.serenitydojo.ecomerce.acceptancetest.navigation;


import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class NavigationActions extends UIInteractions {


    public void OpenTheLumaApplication(){

        openUrl("https://magento.softwaretestingboard.com/");

    }


    public String  getTitlePage(){

        String titulo = getTitle();

        return titulo;
    }

}
