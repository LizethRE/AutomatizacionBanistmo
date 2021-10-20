package com.banistmo.reto.tasks;

import com.banistmo.reto.userinterface.ActualidadEconomicaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionaReporteActualidadEconomica implements Task {
    String nombreReporte;

    public SeleccionaReporteActualidadEconomica(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ActualidadEconomicaPage.VER_MAS_BUTTON),
                Click.on(ActualidadEconomicaPage.VER_MAS_BUTTON),
                Click.on(ActualidadEconomicaPage.REPORTE(nombreReporte))
        );
    }

    public static SeleccionaReporteActualidadEconomica delGrupoBancolombia(String nombreReporte){
        return Tasks.instrumented(SeleccionaReporteActualidadEconomica.class, nombreReporte);
    }
}
