package base;

import org.openqa.selenium.WebDriver;

/**
 * Created by mihaleva on 03.03.2016.
 */
public class BaseSteps {

    public WebDriver driver = null;

    public BaseSteps(WebDriver driver){

        this.driver = driver;
    }

    String urlCalc = "http://corpcalc.dev.mstatic.ru/";


    public void navigate() {

        driver.get(urlCalc);
    }

    public void kill() {

        driver.close();
    }
}
