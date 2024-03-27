package PMO;

import SeleniumTestGral.BaseConfiTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPOM extends BaseTestConfPOM {
    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By emailInput = By.id("input-email");
    private By phoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By confirmPasswordInput = By.id("input-confirm");
    private By checkboxConfirmInput = By.name("agree");

    private By continueButtonInput = By.xpath("//input[@value=\"Continue\"]");
    public RegisterPOM(WebDriver driver){
        super (driver);
    }
    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(emailInput, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(confirmPasswordInput, password);
        click(checkboxConfirmInput);
        click(continueButtonInput);
    }
}

