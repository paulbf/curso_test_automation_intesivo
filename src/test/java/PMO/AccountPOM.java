package PMO;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPOM extends BaseTestConfPOM {

    private By title = By.xpath("//h1[text()=\"Account\"]");
    private By description =
            By.xpath("//p[contains(text(), \"Your new account has been successfully created\")]");



    public AccountPOM (WebDriver driver){
        super(driver);
    }
    public boolean titleIsDisplayed() {
        return isDisplayed(title);
    }

    public boolean descriptionIsDisplayed() {
        return isDisplayed(description);
    }

}
