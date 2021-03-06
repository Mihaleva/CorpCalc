package pageFactory;

import Help.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * Created by mihaleva on 01.03.2016.
 */
public class StartPage {

    public StartPage(WebDriver driver) {
//Нужно инициализировать page object.
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login-blc")
    WebElement loginForm;

    public void checkLoginForm(WebDriver driver) throws InterruptedException {

        Waiter.wait(driver, "login-blc", 10, 'c');
        Assert.assertTrue(loginForm.isDisplayed());

    }
}