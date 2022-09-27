package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    By confirmCartLocator=By.xpath("//a[@href='/orders/checkout/']");
    By continueWithoutRegistration=By.xpath("//a[@title='ÜYE OLMADAN DEVAM ET']");
    By eMail=By.xpath("//input[@name='user_email']");
    By continuebutton =By.xpath("//button[@class='button block green']");
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void confirmCart() {
        click(confirmCartLocator);
        click(continueWithoutRegistration);
        send(eMail);
        click(continuebutton);

    }
}
