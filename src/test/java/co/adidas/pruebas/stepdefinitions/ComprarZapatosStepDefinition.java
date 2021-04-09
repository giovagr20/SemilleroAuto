package co.adidas.pruebas.stepdefinitions;

import co.adidas.pruebas.models.CompraModel;
import co.adidas.pruebas.steps.ComprarZapatosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ComprarZapatosStepDefinition {

    @Steps
    private ComprarZapatosSteps comprarZapatosSteps;
    private CompraModel modelo = new CompraModel();


    @Dado("^el usuario ingresa a la pagina web$")
    public void elUsuarioIngresaALaPaginaWeb() {
        comprarZapatosSteps.abrirPaginaWeb();
        comprarZapatosSteps.validarExistenciaDeImagen();
    }

    @Cuando("^el usuario busca \"([^\"]*)\"$")
    public void elUsuarioBusca(String texto) {
        modelo.setPrenda(texto);
        comprarZapatosSteps.buscarZapatos(modelo.getPrenda());
    }

    @Cuando("^clickea de futbol$")
    public void clickeaDeFutbol() {

    }

    @Entonces("^el usuario elige \"([^\"]*)\"$")
    public void elUsuarioElige(String arg1) {

    }

    @Entonces("^elige la talla de \"([^\"]*)\"$")
    public void eligeLaTallaDe(String arg1) {
    }


    @Entonces("^se agrega al carrito de compra$")
    public void seAgregaAlCarritoDeCompra() {

    }

    @Entonces("^valida \"([^\"]*)\"$")
    public void valida(String arg1) {

    }



}
