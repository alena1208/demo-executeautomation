package Selenium.pages;

import Selenium.util.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage{

    private  WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "input[name='UserName']")
    WebElement textUserName;

    @FindBy(css = "input[name='Password']")
    WebElement textPassword;

    @FindBy(css = "input[name='Login']")
    WebElement buttonLogin;

    @Step("Login to site with User Name [{0}] and Password [{1}]")
    public void login(String userName, String password) {
        Util.sendKeysToElement(userName, textUserName);
        Util.sendKeysToElement(password, textPassword);
        Util.clickOnElement(buttonLogin);
    }
}
