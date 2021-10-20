package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ActualidadEconomicaPage extends PageObject {
    public static final Target VER_MAS_BUTTON = Target.the("boton para ver mas reportes").
            located(By.id("verMas"));
    public static Target REPORTE(String nombreReporte){
        return Target.the("reporte de actualidad economica").
                located(By.xpath("//a[contains(.,'" + nombreReporte+ "')]"));
    }
}