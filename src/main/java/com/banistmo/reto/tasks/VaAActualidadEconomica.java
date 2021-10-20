package com.banistmo.reto.tasks;

import com.banistmo.reto.interactions.SwitchWindows;
import com.banistmo.reto.userinterface.CapitalInteligentePage;
import com.banistmo.reto.userinterface.EmpresasPage;
import com.banistmo.reto.userinterface.GrupoBancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class VaAActualidadEconomica implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GrupoBancolombiaPage.CERRAR_MODAL_BUTTON),
                Click.on(GrupoBancolombiaPage.MENU_EMPRESAS_LINK),
                Click.on(EmpresasPage.SUBMENU_CAPITAL_INTELIGENTE_LINK),
                SwitchWindows.setWindow(),
                Click.on(CapitalInteligentePage.MENU_ACTUALIDAD_ECONOMICA_LINK)
        );
    }

    public static VaAActualidadEconomica delGrupoBancolombia(){
        return Tasks.instrumented(VaAActualidadEconomica.class);
    }
}
