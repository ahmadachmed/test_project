package setups;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup extends DriverPool {

    private AppiumDriverLocalService service;

    protected void prepareAutomation() throws MalformedURLException {
        Capabilities capabilities = new Capabilities();
        capabilities.realAndroid();

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities.realAndroid());
        setDriverInstance(driver);
        System.out.println("Driver: " + driver);
    }

    protected void startAppium() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("URL: " + service_url);
    }

    protected void stopAppium() {
        service.stop();
    }
}