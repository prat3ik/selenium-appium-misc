import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    WebDriver driver;

    // Remote URL is address of Node connected to Selenium Hub. Format is: http://<node-url>:<port>/wd/hub
    final String remoteURL = "http://192.168.0.105:5648/wd/hub";

    @BeforeMethod
    public void beforeMethod() throws MalformedURLException {
        System.out.println(" Before method:");
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL(remoteURL), caps);
    }

    @Test
    public void test(){
        driver.get("https://www.google.com");
    }
}
