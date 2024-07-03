package com.nttdata.steps;

import com.nttdata.screens.SauceLabDemoScreen;
import org.junit.Assert;

public class SauceLabDemoStep {
    SauceLabDemoScreen sauceLabDemoScreen;

    public void validacionCargaProductos() {
        Assert.assertTrue("No se encontraron productos en la galería", sauceLabDemoScreen.validarCargaProductos() > 0);
        sauceLabDemoScreen.cantidadProductos();
    }
    public void agregarUnidadesDelProducto(String producto, int unidades) {
        sauceLabDemoScreen.seleccionarYAumentarCantidadProducto(producto,unidades);
        sauceLabDemoScreen.clickagregarcarrito();
    }
    public void validacionProductocarrito() {
        sauceLabDemoScreen.clickIrAlCarrito();
        Assert.assertTrue("No se encontraron productos en el carrito", sauceLabDemoScreen.validarProductoAgregadoCarrito() > 0);
        sauceLabDemoScreen.validarcantidadCarrito();
        sauceLabDemoScreen.cantidadCarro();
    }




}
