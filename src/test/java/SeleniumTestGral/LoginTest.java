package SeleniumTestGral;

import PMO.BaseTestConfPOM;
import PMO.HomePMO;
import PMO.LoginPOM;
import PMO.MyAccountPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends BaseConfiTest {


    private LoginTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginTest () {
        HomePMO homepmo = new HomePMO(getDriver());
        LoginPOM loginPOM = new LoginPOM(getDriver());
        MyAccountPOM myAccountPOM = new MyAccountPOM(getDriver());

        // paso 1 = levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // paso 2 = clic en myaccount
        //By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
        //WebElement myAccountEl = getDriver().findElement(myAccountBy);
        //myAccountEl.click();

        homepmo.clickMyAccount();

        // paso 3 = clic en login
        //By loginBy = By.xpath("//a[text()=\"Login\"]");
        //WebElement loginEL = getDriver().findElement(loginBy);
        //loginEL.click();

        homepmo.clickLoginDropdown();

        // paso 4 = completar login


        //By inputEmailBy = By.id("input-email");
        //By inputPassBy = By.id("input-password");
        //By buttonLoginBy = By.xpath("//input [@value=\"Login\"]");

        //WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
       // WebElement inputPassEl = getDriver().findElement(inputPassBy);
        //WebElement buttonLoginEl = getDriver().findElement(buttonLoginBy);

        //inputEmailEl.sendKeys("cursolunes@gmail.com");
        //inputPassEl.sendKeys("cursolunes");
        //buttonLoginEl.click();

       loginPOM.setEmail();
       loginPOM.setPass();
       loginPOM.clickLogin();

        // paso 5 = validar mi account
        //By textMyAccountBy = By.xpath("//h2 [text()=\"My Account\"]");
        //WebElement textMyAccountEl = getDriver().findElement(textMyAccountBy);

        //Assert.assertTrue(textMyAccountEl.isDisplayed());

        Assert.assertTrue(myAccountPOM.titleIsDisplayed());

    }






}
