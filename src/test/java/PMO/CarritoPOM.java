package PMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPOM extends BaseTestConfPOM {


    private By cameraButton = By.xpath("//a[text()=\"Cameras\"]");
    private By addCartButton = By.xpath("//button[@onclick=\"cart.add('30','1');\"]");

    private By selectOptions = By.xpath("//select/option[@value()=\"15\"]");

    private By addToCartButton = By.id("button-cart");

    private By listCartTotalButton = By.id("cart-total");

    private By verListCartButtom = By.xpath("//p/a[text()=\"View Cart\"]");

    private By canonCamera = By.xpath("//td/a[text()=\"Canon EOS 5D\"]");



    public CarritoPOM(WebDriver driver) {
        super(driver);
    }

    public void ingresarASeccionCamaras() {
        click(cameraButton);
    }

    public void agregarUnProductoACart() {
        click(addCartButton);
    }

    public void seleccionarOpcionCompra() {
        click(selectOptions);
    }

    public boolean confirmarProductoCart() {
        return isDisplayed(addToCartButton);
    }

    public void verConfirmarProductoCart() {
        click(listCartTotalButton);
    }

    public void verListaConfirmacionCart() {
        click(verListCartButtom);
    }

    public boolean validarProductoCarrito() {
        return isDisplayed(canonCamera);
    }


}
