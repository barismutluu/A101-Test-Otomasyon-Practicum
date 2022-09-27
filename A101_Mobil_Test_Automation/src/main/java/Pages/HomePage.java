package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

    By AppA101Locator=By.xpath("//android.widget.TextView[@content-desc=\"A101\"]");

    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void selectA101App() {
        click(AppA101Locator);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
