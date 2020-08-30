package settings;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;
    private static Dimension dimension;
    private static WebDriverWait wait;

    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void quitProcess()
    {
       driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUrl(String url){
        driver.get(url);
    }

    public static String getURL() {
        return driver.getCurrentUrl();
    }

    public static void setDimension(int x,int y){
        dimension = new Dimension(x,y);
        driver.manage().window().setSize(dimension);
    }

    public static WebElement waitVisibleElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void waitInvisibilityElement(By by){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static WebElement waitClickAbleElement(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}