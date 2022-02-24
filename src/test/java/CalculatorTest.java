import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorTest {

    AppiumDriver<MobileElement> driver;
    @Test
    public void test1() throws MalformedURLException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("platformVersion", "10.0");
            desiredCapabilities.setCapability("deviceName", "Pixel 3");
            //android apps have .apk extension
            //file can be stored locally or in a cloud storage
            desiredCapabilities.setCapability("app", "https://cybertek-appium.s3.amazonaws.com/calculator.apk");
            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            //address of appium server
            URL url = new URL("http://localhost:4723/wd/hub");
            AppiumDriver<MobileElement> driver = new AndroidDriver<>(url, desiredCapabilities);
    }
}
