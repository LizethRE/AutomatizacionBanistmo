package com.banistmo.reto.tasks;

import com.banistmo.reto.interactions.SwitchWindows;
import com.banistmo.reto.userinterface.ReporteActualidadInteligentePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DescargaReporteActualidadEconomica implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReporteActualidadInteligentePage.DESCARGA_PDF_LINK),
                SwitchWindows.setWindow()
        );
    }

    public static DescargaReporteActualidadEconomica delGrupoBancolombia(){
        return Tasks.instrumented(DescargaReporteActualidadEconomica.class);
    }
}
