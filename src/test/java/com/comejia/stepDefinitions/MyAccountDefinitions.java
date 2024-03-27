package com.comejia.stepDefinitions;

import PMO.MyAccountPOM;
import com.comejia.hooks.Hooks;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class MyAccountDefinitions {

    private MyAccountPOM myAccountPOM;

    public MyAccountDefinitions (){
        this.myAccountPOM = new MyAccountPOM(Hooks.getDriver());
    }

    @Entonces("el usuario se encientra en su cuenta")
    public void elUsuarioSeEncientraEnSuCuenta() {

        Assert.assertTrue(myAccountPOM.titleIsDisplayed());
    }
}
