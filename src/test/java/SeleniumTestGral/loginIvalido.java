package SeleniumTestGral;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginIvalido extends BaseConfiTest{

    public loginIvalido(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginIvalido() {


        // paso 1 = levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // paso 2 = clic en myaccount
        By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
        WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

        // paso 3 = clic en login
        By loginBy = By.xpath( "//a[text()=\"Login\"]");
        WebElement loginEL = getDriver().findElement(loginBy);
        loginEL.click();

        // paso 4 = completar login
        By inputEmailBy = By.id("input-email");
        By inputPassBy = By.id("input-password");
        By buttonLoginBy = By.xpath( "//input [@value=\"Login\"]");

        WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
        WebElement inputPassEl = getDriver().findElement(inputPassBy);
        WebElement buttonLoginEl = getDriver().findElement(buttonLoginBy);

        inputEmailEl.sendKeys("cursolunes@gmail.com");
        inputPassEl.sendKeys("cursolun");
        buttonLoginEl.click();

        // paso 5 = login invalido
        By errorloginBy = By.xpath("//div[contains(text(), \"No match for E-Mail Address and/or Password\")]");
        WebElement errorLoginEl = getDriver().findElement(errorloginBy);

        Assert.assertTrue(errorLoginEl.isDisplayed());



    }


}
