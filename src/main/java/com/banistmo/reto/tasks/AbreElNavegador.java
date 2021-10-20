package com.banistmo.reto.tasks;

import com.banistmo.reto.userinterface.GrupoBancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbreElNavegador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new GrupoBancolombiaPage()));
    }

    public static AbreElNavegador enLaPagina(){
        return Tasks.instrumented(AbreElNavegador.class);
    }
}
