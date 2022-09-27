package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class UyePage extends BasePage{
    By uyeOlmadanDevam=By.xpath("//android.widget.TextView[@text='ÜYE OLMADAN DEVAM ET']");
    By eMail=By.xpath("//android.widget.EditText[@text='E-posta Adresiniz']");
    By onay=By.xpath("//android.view.ViewGroup[@package='org.studionord.a101'][@enabled='true'][@focusable='true'][@index='1']");
    By gonder=By.xpath("//android.widget.TextView[@text='GÖNDER']");
    public UyePage(AndroidDriver driver) {
        super(driver);
    }

    public void bilgiler() {
        click(uyeOlmadanDevam);
        send(eMail);
        click(onay);
        click(gonder);

    }
}
