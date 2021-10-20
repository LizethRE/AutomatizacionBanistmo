package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.grupobancolombia.com/")
public class GrupoBancolombiaPage extends PageObject {
    public static final Target CERRAR_MODAL_BUTTON = Target.the("icono para cerrar el modal de publicidad").
            located(By.cssSelector(".btn-close-modal"));
    public static final Target MENU_EMPRESAS_LINK = Target.the("enlace para ir a opcion del menu Empresas").
            located(By.cssSelector("#header-empresas"));
}