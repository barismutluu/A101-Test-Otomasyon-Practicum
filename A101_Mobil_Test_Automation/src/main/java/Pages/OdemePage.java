package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdemePage extends BasePage{
    By kaydetVeDevam=By.xpath("//android.widget.Button[@text='Kaydet ve Devam Et']");
    public OdemePage(AndroidDriver driver) {
        super(driver);
    }

    public void odemedogrulama() throws InterruptedException {
        Thread.sleep(1000);
        click(kaydetVeDevam);
        WebElement SiyahKontrol=driver.findElement(By.xpath("//android.view.View[@text='CVC']"));
        Assert.assertTrue("Ödeme sayfası Doğrulanamadı!", SiyahKontrol.isDisplayed());

    }
}
