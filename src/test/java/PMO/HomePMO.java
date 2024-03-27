package PMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePMO {

    private By inputBy = By.name("search");
    private By carrouselBy = By.id("content");
    private By menuBy = By.id("menu");
    private By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
    private By loginBy = By.xpath("//a[text()=\"Login\"]");
    private By registerBy = By.xpath("//a[text()=\"Register\"]");


    private WebDriver driver;


    public HomePMO (WebDriver driver){
        this.driver = driver;

    }
    public boolean inputdIsDisplayed () {
       WebElement inputEl = driver.findElement(inputBy);
       return inputEl.isDisplayed();

        //return driver.findElement(inputBy).isDisplayed();
    }

    public boolean carruselIsDisplayed () {
        WebElement carruselEL = driver.findElement(carrouselBy);
        return carruselEL.isDisplayed();
        }

        public boolean menulIsDisplayed () {
            WebElement menulEL = driver.findElement(menuBy);
            return menulEL.isDisplayed();
        }

    public boolean myAccountDisplayed () {
        WebElement myAccountlEL = driver.findElement(myAccountBy);
        return myAccountlEL.isDisplayed();
    }

    public void clickMyAccount () {
        WebElement myAccountEl = driver.findElement(myAccountBy);
        myAccountEl.click();
    }

    public void clickLoginDropdown () {

        WebElement loginEl = driver.findElement(loginBy);
        loginEl.click();

    }
    public void clickRegistrerDropdowm (){
        WebElement registerLoginEl = driver.findElement(registerBy);
        registerLoginEl.click();

    }


}
