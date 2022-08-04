package selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridDemo {

    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriver driver;

    {
        try {
            driver = new RemoteWebDriver(new URL("http://www.example.com"), chromeOptions);
            driver.get("http://www.google.com");
            driver.quit();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
