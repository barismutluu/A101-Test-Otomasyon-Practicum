package Pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Payment extends BasePage{
    public Payment(WebDriver driver) {
        super(driver);
    }

    public void controlpayment() {
        String odemekontrol="checkout";
        String actualUrl=driver.getCurrentUrl();
        Assertions.assertTrue(actualUrl.contains(odemekontrol));

    }
}
