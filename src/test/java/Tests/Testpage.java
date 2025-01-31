package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Testpage {
    public static WebDriver driver;
    @BeforeSuite

    public void startDriver() throws InterruptedException {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://staging.nazeel.net:9002/login");
    }
    @AfterSuite
    public void closeDriver()
    {
        driver.quit();
    }
}
