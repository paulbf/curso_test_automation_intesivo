package com.comejia.stepDefinitions;

import PMO.HomePMO;
import com.comejia.hooks.Hooks;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePMO homePMO;

    private HomeDefinitions(){
        this.homePMO = new HomePMO(Hooks.getDriver());
    }
    @Dado("que el usuario ingresa a la pantalla de inicio")
    public void queElUsuarioIngresaALaPantallaDeInicio() {
        Hooks.getDriver().get(Hooks.getProperty("url"));
        
    }

    @Entonces("se valida que la pantalla de incio se muestre correctamente")
    public void seValidaQueLaPantallaDeIncioSeMuestreCorrectamente() {

        Assert.assertTrue(homePMO.inputdIsDisplayed());
        Assert.assertTrue(homePMO.carruselIsDisplayed());
        Assert.assertTrue(homePMO.menulIsDisplayed());
        Assert.assertTrue(homePMO.myAccountDisplayed());

    }
}
