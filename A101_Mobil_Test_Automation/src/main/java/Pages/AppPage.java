package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppPage extends BasePage{
    By kategoriler=By.xpath("//android.widget.TextView[@text='\uE90F']");
    By giyimVeAksesuar=By.xpath("//android.widget.TextView[@text='GİYİM & AKSESUAR']");
    By kadinIcGiyim=By.xpath("//android.widget.TextView[@text='Kadın İç Giyim']");
    By dizAltiCorap=By.xpath("//android.widget.TextView[@text='Dizaltı Çorap']");
    public AppPage(AndroidDriver driver) {
        super(driver);
    }

    public void selectCategory() {
        click(kategoriler);
        click(giyimVeAksesuar);
        click(kadinIcGiyim);
        click(dizAltiCorap);


    }
}
