package co.adidas.pruebas.steps;

import co.adidas.pruebas.pageobjects.AdidasPageObject;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Step;

public class ComprarZapatosSteps {

    private static String URL = "https://www.adidas.co";
    private AdidasPageObject adidasPageObject = new AdidasPageObject();

    @Step
    public void abrirPaginaWeb(){
        adidasPageObject.getDriver().get(URL);
        adidasPageObject.getDriver().manage().window().maximize();
    }

    @Step
    public void validarExistenciaDeImagen() {
        if(!adidasPageObject.getDriver().findElement(adidasPageObject.getImgAdidas()).isDisplayed()) {
            throw new PendingException("Imagen no encontrada");
        }
    }

    @Step
    public void buscarZapatos(String texto) {
        adidasPageObject.getDriver().findElement(adidasPageObject.getInpBusqueda()).sendKeys(texto);
    }
}
