package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by mihaleva on 28.01.2016.
 */
//здесь инициализация драйвера
public class BaseTest {

    //здесь инициализация драйвера
    WebDriver driver = null;
    String urlCalc= "http://corpcalc.dev.mstatic.ru/";




    public WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        driver = new ChromeDriver(DesiredCapabilities.chrome());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public void navigate() {

        driver.get(urlCalc);
    }


    public void kill() {

        driver.close();
    }

}