package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.HomePage.*;

public class optionCase implements Task {


    private String texto;
    private String option;

    public optionCase (String texto, String option) {
        this.texto = texto;
        this.option=option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        System.out.println("TEXTOOOOO"+texto.toUpperCase());
        actor.attemptsTo(
                Enter.theValue(texto).into(INPUT_TEXTO),
                Click.on(BUTTON_CASE),
                Click.on(OPTION_CASE.of(option)),
                Ensure.that(INPUT_TEXTO).text().isEqualTo(texto.toUpperCase())
        );


    }

    public static optionCase selectCase (String texto, String option) {

        return instrumented(optionCase.class, texto, option);
    }
}



