package co.uk.zoopla.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager
{
    private WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initOpera()
    {
        WebDriverManager.operadriver().setup();
        return new OperaDriver();
    }
    private WebDriver initEdge()
    {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    private WebDriver initChromeHeadless()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");
        return new ChromeDriver(options);
    }
    private WebDriver initFirefoxHeadless()
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options= new FirefoxOptions();
        options.addArguments("--disable-gpu","--headless");
        return new FirefoxDriver(options);
    }
    private WebDriver initOperaHeadless()
    {
        WebDriverManager.operadriver().setup();
        OperaOptions options=new OperaOptions();
        options.addArguments("--disable-gpu","--headless");
        return new OperaDriver(options);
    }
    public void LunchBrowser(String browser)
    {
        switch (browser)
        {
            case "chrome":
            driver=initChromeDriver();
            break;
            case "Firefox":
                driver=initFirefox();
                break;
            case "Opera":
                driver=initOpera();
                break;
            case "ChromeHeadless":
                driver=initChromeHeadless();
                break;
            case "FirefoxHeadless":
                driver=initFirefoxHeadless();
                break;
            case "OperaHeadless":
                driver=initOperaHeadless();
                break;
            default:
                driver=initChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
