package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class UrunPage extends BasePage{
    By corap=By.xpath("//android.widget.TextView[@text='Penti Kadın 50 Denye Pantolon Çorabı Siyah']");
    By sepeteEkle=By.xpath("//android.widget.TextView[@text='SEPETE EKLE']");
    By sepeteGit=By.xpath("//android.widget.TextView[@text='SEPETE GİT']");
    By sepeteOnayla=By.xpath("//android.widget.TextView[@text='SEPETİ ONAYLA']");
    public UrunPage(AndroidDriver driver) {
        super(driver);
    }

    public void selectsock() throws InterruptedException {
        click(corap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement SiyahKontrol=driver.findElement(By.xpath("//android.widget.TextView[@text='Penti Kadın 50 Denye Pantolon Çorabı Siyah'][@index='2']"));
        Assert.assertEquals("Penti Kadın 50 Denye Pantolon Çorabı Siyah",SiyahKontrol.getText());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(sepeteEkle);
        Thread.sleep(1000);
        click(sepeteGit);
        Thread.sleep(1000);
        click(sepeteOnayla);


    }
}
