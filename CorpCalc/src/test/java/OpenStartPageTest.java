import base.BaseTest;
import base.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import step.StepStart;


/**
 * Created by mihaleva on 23.03.2016.
 */
public class OpenStartPageTest extends BaseTest {

    WebDriver driver = null;
    StepStart step = null;

    @Test
    public void openStartPage() throws InterruptedException {

        step.
                openCorpCalc();

    }

    @BeforeTest
    public void bornDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver.exe");
        step = new StepStart(driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome()));
        driver.manage().window().maximize();
    }

    @AfterTest
      public void killDriver() {

          driver.quit();
      }

}
