package com.comejia.stepDefinitions;

import PMO.CarritoPOM;
import PMO.FavoritosPOM;
import com.comejia.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarritoDefinitions {

    private CarritoPOM carritoPOM;

    public CarritoDefinitions() {
        this.carritoPOM = new CarritoPOM (Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {

        carritoPOM.ingresarASeccionCamaras();
        carritoPOM.agregarUnProductoACart();
        carritoPOM.seleccionarOpcionCompra();
        carritoPOM.confirmarProductoCart();
        carritoPOM.verConfirmarProductoCart();
        carritoPOM.verListaConfirmacionCart();

    }

    @Entonces("validar que se agrego el producto al carrito")
    public void validarQueSeAgregoElProductoAlCarrito() {

        Assert.assertTrue(carritoPOM.validarProductoCarrito());

    }
}
