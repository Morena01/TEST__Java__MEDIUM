import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Configuration {
    private static WebDriver driver;

    /**
     * constructor
     */
    public Configurator () {}
    /**
     * method setUp connecting the driver
     */
    public static void setUp (){
        System.setProperty("webdriver.geckodriver", "/home/lipsi/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /**
     * method tearDown completes
     */
    public static void tearDown(){
        if(driver !=null) {
           driver.quit();
        }
    }
    public static WebDriver getDriver() { return driver;}
}

