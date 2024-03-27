package com.comejia.stepDefinitions;

import PMO.FavoritosPOM;
import com.comejia.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class FavoritosDefinitions {

    private FavoritosPOM favoritosPOM;

    public FavoritosDefinitions() {
        this.favoritosPOM = new FavoritosPOM (Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {

        favoritosPOM.ingresarASeccionCamaras();
        favoritosPOM.agregarUnProductoAFav();
        favoritosPOM.ingresarAFavoritos();
        
    }

    @Entonces("se valido que se agrego un producto a favoritos")
    public void seValidoQueSeAgregoUnProductoAFavoritos() {

        Assert.assertTrue(favoritosPOM.cameraInFavIsDisplayed());
    }
}
