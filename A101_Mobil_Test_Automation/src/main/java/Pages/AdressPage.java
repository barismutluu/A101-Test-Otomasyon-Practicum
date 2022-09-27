package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AdressPage extends BasePage{
    By yeniAdres=By.xpath("//android.view.View[@text='\uE919 Yeni adres oluştur']");
    By adresyaz=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.widget.EditText");

    public AdressPage(AndroidDriver driver) {
        super(driver);
    }

    public void adresbilgiler() throws InterruptedException {
        click(yeniAdres);
        adressbilgi(adresyaz);

    }
}
