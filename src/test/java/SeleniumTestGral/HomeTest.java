package SeleniumTestGral;

import PMO.HomePMO;
import com.beust.ah.A;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.annotations.Test;


public class HomeTest extends BaseConfiTest {


    public HomeTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void validarHome () {
        HomePMO homePMO = new HomePMO(getDriver());

        // paso 1 = levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // paso 2 = realizar la asercion

        //By inputBy = By.name("search");
        //By carrouselBy = By.id("content");
        //By menuBy = By.id("menu");
        //By myAccountBy = By.xpath("//a[@title=\"My Account\"]");

        //WebElement inputEl = getDriver().findElement(inputBy);
        //WebElement carrouselEl = getDriver().findElement(carrouselBy);
        //WebElement menuEl = getDriver().findElement(menuBy);
        //WebElement myAccountEl = getDriver().findElement(myAccountBy);

        //Assert.assertTrue(inputEl.isDisplayed());
        //Assert.assertTrue(carrouselEl.isDisplayed());
        //Assert.assertTrue(menuEl.isDisplayed());
        //Assert.assertTrue(myAccountEl.isDisplayed());

        Assert.assertTrue(homePMO.inputdIsDisplayed());
        Assert.assertTrue(homePMO.carruselIsDisplayed());
        Assert.assertTrue(homePMO.menulIsDisplayed());
        Assert.assertTrue(homePMO.myAccountDisplayed());

    }



}
