import Pages.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class A101_Mobil_Test extends BaseTest{
    HomePage homePage ;
    AppPage appPage;
    UrunPage urunPage;
    UyePage uyePage;
    AdressPage adressPage;
    OdemePage   odemePage;

    @Test
    @Order(1)
    public void A101Sec(){
        homePage=new HomePage(driver);
        homePage.selectA101App();

    }
    @Test
    @Order(2)
    public void A101Uygulamasi(){
        appPage=new AppPage(driver);
        appPage.selectCategory();

    }
    @Test
    @Order(3)
    public void UrunSecimi() throws InterruptedException {
        urunPage=new UrunPage(driver);
        urunPage.selectsock();


    }
    @Test
    @Order(4)
    public void UyeSayfasi(){
        uyePage=new UyePage(driver);
        uyePage.bilgiler();


    }
    @Test
    @Order(5)
    public void AdresSayfasi() throws InterruptedException {
        adressPage=new AdressPage(driver);
        adressPage.adresbilgiler();

    }
    @Test
    @Order(6)
    public void OdemeSayfasi() throws InterruptedException {
        odemePage=new OdemePage(driver);
        odemePage.odemedogrulama();

    }

}
