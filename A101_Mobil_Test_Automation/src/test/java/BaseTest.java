import TestLogger.TestResultLogger;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {
    AndroidDriver<MobileElement> driver;


    @BeforeAll
    public void setUp() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("appium:appPackage", "org.studionord.a101");
            desiredCapabilities.setCapability("appium:appActivity", "org.studionord.a101.MainActivity");
            desiredCapabilities.setCapability("appium:udid", "192.168.104.101:5555");
            desiredCapabilities.setCapability("appium:automationName", "A101");
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
            desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
            desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
            desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
            desiredCapabilities.setCapability("appium:fastReset", "true");

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");
            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

        @AfterAll
        public void tearDown () {
            driver.quit();
        }

    }
