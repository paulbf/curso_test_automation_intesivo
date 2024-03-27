package com.comejia.stepDefinitions;

import PMO.HomePMO;
import PMO.LoginPOM;
import com.comejia.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;

public class LoginDefinitions {

    private HomePMO homePMO;
    private LoginPOM loginPOM;

    public LoginDefinitions (){
        this.homePMO = new HomePMO(Hooks.getDriver());
        this.loginPOM = new LoginPOM(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pagina")
    public void queElUsuarioIngresaALaPagina() {

        Hooks.getDriver().get(Hooks.getProperty("url"));

        // paso 2 = clic en myaccount
        homePMO.clickMyAccount();

        // paso 3 = clic en login
        homePMO.clickLoginDropdown();
        
    }

    @Cuando("el usuario se loguea con credenciales validas")
    public void elUsuarioSeLogueaConCredencialesValidas() {
        loginPOM.login (Hooks.getProperty("username"), Hooks.getProperty("password"));

        //Hooks.getDriver().get(Hooks.getProperty("username"));
        //Hooks.getDriver().get(Hooks.getProperty("password"));
        //loginPOM.setEmail();
    }

    @Y("el usuario se loguea en la aplicacion")
    public void elUsuarioSeLogueaEnLaAplicacion() {

        // paso 2 = clic en myaccount
        homePMO.clickMyAccount();

        // paso 3 = clic en login
        homePMO.clickLoginDropdown();

        loginPOM.login (Hooks.getProperty("username"), Hooks.getProperty("password"));

    }
}
