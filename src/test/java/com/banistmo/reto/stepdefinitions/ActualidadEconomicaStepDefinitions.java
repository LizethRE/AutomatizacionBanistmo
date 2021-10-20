package com.banistmo.reto.stepdefinitions;

import com.banistmo.reto.questions.ElNombreDelDocumento;
import com.banistmo.reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ActualidadEconomicaStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = Actor.named("Usuario Web");
    String ventanaPrincipal;

    @Before
    public void actualidadEconomicaSetUp(){
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("^que el usuario quiere acceder a la pagina de Actualidad Economica del Grupo Bancolombia$")
    public void que_el_usuario_quiere_acceder_a_la_pagina_de_actualidad_economica_del_grupo_bancolombia() {
        actor.wasAbleTo(
                AbreElNavegador.enLaPagina(),
                VaAActualidadEconomica.delGrupoBancolombia()
        );
    }


    @When("^selecciona el reporte (.*)$")
    public void selecciona_el_reporte(String nombreReporte) {
        actor.attemptsTo(SeleccionaReporteActualidadEconomica.delGrupoBancolombia(nombreReporte));
    }

    @When("^descarga el informe$")
    public void descarga_el_informe() {
        actor.attemptsTo(DescargaReporteActualidadEconomica.delGrupoBancolombia());
    }

    @Then("^deberia ver el informe generado en PDF$")
    public void deberia_ver_el_informe_generado_en_pdf() {
        actor.should(GivenWhenThen.seeThat(ElNombreDelDocumento.es("informe-sectorial-petroleo-junio-2021.pdf")));
    }
}
