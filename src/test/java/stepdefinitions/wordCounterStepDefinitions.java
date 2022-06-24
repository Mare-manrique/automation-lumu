package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.writeText;
import task.optionCase;
import userinterface.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class wordCounterStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Juan");
    private HomePage homePage= new HomePage();

    @Given("^he goes to the browser and enters the page$")
    public void heGoesToTheBrowserAndEntersThePage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @When("^he writes the sentence (.*) to validate the number of words and characters$")
    public void heWritesTheSentencetoValidateTheNumberOfWordsAndCharacters(String texto) {
        actor.wasAbleTo(
                writeText.validarPalabrasAndCaracteres(texto)

        );
    }

        @When("^he writes the sentence (.*) to make use of the button and the option (.*)$")
        public void heWritesTheSentenceToMakeUseOfTheButtonAndTheOption(String texto, String option) {
            actor.wasAbleTo(
                    optionCase.selectCase(texto,option)

            );


    }

}
