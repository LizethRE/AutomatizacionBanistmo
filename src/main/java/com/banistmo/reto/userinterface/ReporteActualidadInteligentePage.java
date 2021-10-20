package com.banistmo.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ReporteActualidadInteligentePage extends PageObject {
    public static final Target DESCARGA_PDF_LINK = Target.the("enlace de descarga del documento PDF").
            located(By.xpath("//p[15]//img[@alt='Descargue aquí el informe en PDF del sector petróleo de mayo de 2021.']"));
}