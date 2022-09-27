import Pages.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class A101Test extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    BasketPage basketPage;
    AdressPage adressPage;
    Payment payment;

    @Test
    @Order(1)

    public void accept_cookies(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.selectClothingCategory();

    }
    @Test
    @Order(2)
        public void selectProduct(){
        productsPage=new ProductsPage(driver);
        productsPage.selectProduct();
        productsPage.kontrolSiyah();
        productsPage.addBasket();

        }
    @Test
    @Order(3)
    public void basketPage(){
        basketPage=new BasketPage(driver);
        basketPage.confirmCart();


    }
    @Test
    @Order(3)
    public void adressPage() throws InterruptedException {// Bu kısımda mevcut adres ile kodu çalıştırıldığında hata alınmaktadır Adres bilgisini BasePage-Adress kısmından değiştirilmesi tavsiye edilir.
       adressPage=new AdressPage(driver);
       adressPage.writeAnAddress();

    }
    @Test
    @Order(4)
    public void checkpayment() throws InterruptedException {
        Thread.sleep(1000);
        payment=new Payment(driver);
        payment.controlpayment();

    }
}