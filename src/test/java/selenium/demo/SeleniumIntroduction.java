package selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

    public static void main(String[] args) {


        // Invoke chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spade\\Desktop\\Java\\SeleniumMavenDemo\\src\\main\\resources\\chromedriver.exe");

        // Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String webpageTitle = driver.getTitle();
        System.out.println("Chrome: " + webpageTitle);
        driver.close();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\spade\\Desktop\\Java\\SeleniumMavenDemo\\src\\main\\resources\\geckodriver.exe");

        // Firefox
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        webpageTitle = driver.getTitle();
        System.out.println("Firefox: " + webpageTitle);
        driver.close();



    }
}
