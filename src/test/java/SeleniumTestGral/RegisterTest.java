package SeleniumTestGral;

import SeleniumTestGral.BaseConfiTest;
import PMO.HomePMO;
import PMO.RegisterPOM;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterTest extends BaseConfiTest {

    public RegisterTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void crearCuenta(){
        HomePMO homePMO = new HomePMO(getDriver());

        RegisterPOM registerPOM = new RegisterPOM (getDriver());


        getDriver().get("https://opencart.abstracta.us/");

        homePMO.clickMyAccount();
        homePMO.clickRegistrerDropdowm();

        registerPOM.completarFormulario ("Lunes",
                "curso-lubes",
                "lunes@gmail.com",
                "33254666",
                "asasdasdas"
        );

    }
}
