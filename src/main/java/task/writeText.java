package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.HomePage.*;
import static utils.ValidationPhrase.countWord;

public class writeText implements Task {

    private String texto;

    public writeText(String texto){
        this.texto=texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(texto).into(INPUT_TEXTO),
                Ensure.that(LI_COUNT_CHARACTERS).text().isEqualTo(String.valueOf(texto.length())),
                Ensure.that(LI_COUNT_WORDS).text().isEqualTo(String.valueOf(countWord(texto)))
        );


    }

    public static writeText validarPalabrasAndCaracteres(String texto) {

        return instrumented(writeText.class,texto);
    }



}
