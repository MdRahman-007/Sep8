package Framework.DriverFactories;


import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;
import Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class WebDrivers_Local {

    private static WebDriver driver = null;

    @Before
    public static void before() throws FileNotFoundException {
        ConfigReader configReader = new ConfigReader();
        System.setProperty("webdriver.chrome.driver",
                configReader.chromePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(configReader.url());
        driver.manage().window().maximize();
    }

    @After
    public static void after() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
