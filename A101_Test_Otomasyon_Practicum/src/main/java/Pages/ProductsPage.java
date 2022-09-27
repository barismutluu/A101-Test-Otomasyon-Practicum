package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{
    By selectproduct=By.xpath("//img[@src='https://ayb.akinoncdn.com/products/2020/11/11/54870/d8dbaefe-f64e-45a0-b6d7-e483e4aaf225_size250x250_quality100_cropCenter.jpg']");
    By addbasket=By.xpath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    By viewbasket=By.xpath("//a[@class='go-to-shop']");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public  void selectProduct() {
        click(selectproduct);

    }

    public void kontrolSiyah() {
        WebElement SiyahKontrol=driver.findElement(By.xpath("//span[text()='SİYAH']"));
        Assertions.assertTrue(SiyahKontrol.isDisplayed(),"Ürün Siyah Renkli Değil");
    }

    public void addBasket() {
        click(addbasket);
        click(viewbasket);
    }
}
