package Selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPage {
    @FindBy(css = "input[name='UserName']")
    SelenideElement textUserName;

    @FindBy(css = "input[name='Password']")
    SelenideElement textPassword;

    @FindBy(css = "input[name='Login']")
    SelenideElement buttonLogin;

    @Step("Login with Id [{0}] and Password [{1}]")
    public void login(String login, String password){
        textUserName.sendKeys(login);
        textPassword.sendKeys(password);
        buttonLogin.click();
    }
}
