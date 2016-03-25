package step;
import base.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageFactory.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by mihaleva on 23.03.2016.
 */
public class StepStart extends BaseSteps{

    StartPage startPage = null;


    public StepStart(WebDriver driver) {

        super(driver);
        startPage = new StartPage(driver);
    }


    @Step("Open Pharm")
    public StepStart openCorpCalc() {

        super.navigate();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://corpcalc.dev.mstatic.ru/"));
        return this;

    }


}
