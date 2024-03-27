package PMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPOM {

    By inputEmailBy = By.id("input-email");
    By inputPassBy = By.id("input-password");
    By buttonLoginBy = By.xpath("//input [@value=\"Login\"]");

    private WebDriver driver;

    public LoginPOM(WebDriver driver) {
        this.driver=driver;
    }

    public void setEmail() {
        WebElement inputEmailEl = driver.findElement(inputEmailBy);
        inputEmailEl.sendKeys("cursolunes@gmail.com");
    }

    public void setPass () {
        WebElement inputPassEl = driver.findElement(inputPassBy);
        inputPassEl.sendKeys("cursolunes");
    }

    public void clickLogin () {
        WebElement buttonLoginEl = driver.findElement(buttonLoginBy);
        buttonLoginEl.click();
    }

    public void login(String username, String password) {
    }
}
