package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class EmpresasPage extends PageObject {
    public static final Target SUBMENU_CAPITAL_INTELIGENTE_LINK = Target.the("enlace para ir a opcion Capital Inteligente").
            located(By.xpath("//a[.='Capital Inteligente']"));
}