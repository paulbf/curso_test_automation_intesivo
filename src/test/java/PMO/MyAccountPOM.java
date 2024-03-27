package PMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPOM {
    By textMyAccountBy = By.xpath("//h2 [text()=\"My Account\"]");

    private WebDriver driver;

    public MyAccountPOM (WebDriver driver) {
        this.driver=driver;
    }

    public boolean titleIsDisplayed(){
        WebElement textMyAccountEl = driver.findElement(textMyAccountBy);
        return textMyAccountEl.isDisplayed();
    }
}
