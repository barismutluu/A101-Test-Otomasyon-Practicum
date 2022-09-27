package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AdressPage extends BasePage{
    By newadress=By.linkText("Yeni adres oluştur");
    By writeadress=By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']");
    By saveadress=By.xpath("//button[@class='button green js-set-country js-prevent-emoji']");
    By saveandcontinue=(By.xpath("//button[@class='button block green js-proceed-button']"));
    public AdressPage(WebDriver driver) {
        super(driver);
    }

    public void writeAnAddress() throws InterruptedException {
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        click(newadress);
        adress(writeadress);
        click(saveadress);
        Thread.sleep(3000);
        click(saveandcontinue);

    }
}
