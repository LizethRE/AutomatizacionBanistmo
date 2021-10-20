package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class CapitalInteligentePage extends PageObject {
    public static final Target MENU_ACTUALIDAD_ECONOMICA_LINK = Target.the("enlace para ir a opcion Actualidad económica").
            located(By.xpath("//a[.='Actualidad económica']"));
}