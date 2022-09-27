package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
public class BasePage {

    WebDriver driver ;

    public BasePage(WebDriver driver){
        this.driver = driver ;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }
    public void move (By locator){

        Actions builder=new Actions(driver);
        Action mouseOverHome=builder
                .moveToElement(find(locator))
                .build();
        mouseOverHome.perform();

    }

    public void send(By locator){
        driver.findElement(locator)
        .sendKeys("barismutlu@gmail.com");
    }
    public void adress(By locator) throws InterruptedException {
        Actions actions=new Actions(driver);
        WebElement Form = driver.findElement(locator);
        actions.click(Form).
                sendKeys("İşyeri")
                .sendKeys(Keys.TAB)
                .sendKeys("Barış")
                .sendKeys(Keys.TAB)
                .sendKeys("MUTLU")
                .perform();
        WebElement telno =driver.findElement(By.xpath("//input[@name='phone_number']"));
        telno.sendKeys("5319999999");
        driver.findElement(By.xpath("//select[@name='city']")).click();
        driver.findElement(By.xpath("//option[@value='40']")).click();
        driver.findElement(By.xpath("//select[@name='township']")).click();
        driver.findElement(By.xpath("//option[@value='485']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@name='district']")).click();
        driver.findElement(By.xpath("//option[@value='36320']")).click();
        WebElement Adress = driver.findElement(By.xpath("//textarea[@name='line']"));
        Adress.sendKeys("Burhaniye Mah. Nagehan Sok.No:4B/1 Üsküdar,İstanbul");


    }



    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }


}
