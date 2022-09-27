package Pages;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    By acceptCookiesLocator = By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");
    By reklamCookiesLocator=By.xpath("//div[@class='closePopupPersona']");
    By giyimAksesuar=By.xpath("//a[@title='GİYİM & AKSESUAR']");
    By dizAltiCorap=By.xpath("//a[@href='/giyim-aksesuar/dizalti-corap/']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {

        if (isDisplayed(acceptCookiesLocator)) {
            click(acceptCookiesLocator);
        } else if (isDisplayed(reklamCookiesLocator)) {
            click(reklamCookiesLocator);

        }
    }

    public void selectClothingCategory() {
        driver.navigate().refresh();
        move(giyimAksesuar);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        click(dizAltiCorap);

    }

}
