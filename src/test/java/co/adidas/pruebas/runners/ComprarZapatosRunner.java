package co.adidas.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/co.adidas.pruebas/feature/comprar_zapatos.feature"},
        glue = "co.adidas.pruebas.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class ComprarZapatosRunner {
}
