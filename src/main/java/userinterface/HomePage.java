package userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://wordcounter.net/")
public class HomePage extends PageObject {

    public static final Target INPUT_TEXTO =
            Target.the("Input donde se ingresa el texto").located(By.id("box"));


    public static final Target LI_COUNT_WORDS =
            Target.the("Cantidad de palabras del texto").located(By.id("word_count"));


    public static final Target LI_COUNT_CHARACTERS =
            Target.the("Cantidad de letras del texto").located(By.id("character_count"));

    public static final Target BUTTON_CASE=
            Target.the("seleccionar opcion").located(By.id("case-btn"));

    public static final Target OPTION_CASE=
            Target.the("seleccionar opcion").locatedBy("//a[text()='{0}']");


}
