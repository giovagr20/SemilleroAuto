package co.adidas.pruebas.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.adidas.co/")
public class AdidasPageObject extends PageObject {

    By imgAdidas = By.xpath("//span[contains(text(), 'adidas')]");
    By inpBusqueda = By.name("q");
    By imgZapatos = By.xpath("//*[@class='gl-product-card__assets-link'][2]");


    public By getImgAdidas() {
        return imgAdidas;
    }

    public void setImgAdidas(By imgAdidas) {
        this.imgAdidas = imgAdidas;
    }

    public By getInpBusqueda() {
        return inpBusqueda;
    }

    public void setInpBusqueda(By inpBusqueda) {
        this.inpBusqueda = inpBusqueda;
    }

    public By getImgZapatos() {
        return imgZapatos;
    }

    public void setImgZapatos(By imgZapatos) {
        this.imgZapatos = imgZapatos;
    }
}
