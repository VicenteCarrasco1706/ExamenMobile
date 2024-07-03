package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SauceLabDemoStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabDemoSD {

    @Steps
    SauceLabDemoStep sauceLabDemoStep;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        sauceLabDemoStep.validacionCargaProductos();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUnidadesDelSiguienteProducto(int unidades, String producto) {
        sauceLabDemoStep.agregarUnidadesDelProducto(producto,unidades);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        sauceLabDemoStep.validacionProductocarrito();
    }
}
