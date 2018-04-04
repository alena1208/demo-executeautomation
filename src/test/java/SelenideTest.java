import Selenide.base.BaseSelenide;
import Selenide.pages.LoginPage;
import Selenide.pages.UserFormPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static Selenium.base.EnumsOfProject.Title.MR;
import static Selenium.util.TargetProperties.getTestProperty;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class SelenideTest extends BaseSelenide {
    LoginPage loginPage;
    UserFormPage userFormPage;

    @BeforeClass
    public void setUpPages() {
        loginPage = open(getTestProperty("url"),LoginPage.class);
        userFormPage = page(UserFormPage.class);
    }

    @Test
    @Title("Login and User Form filling")
    @Description("Check login and user form page")
    public void checkLogin() {
        //login
        loginPage.login(getTestProperty("login"), getTestProperty("password"));
        userFormPage.checkPageTitle(getWebDriver());
        //Fill form: textFields, radio buttons, checkboxes
        userFormPage.sendKeysToTextFields(getTestProperty("initialName"), getTestProperty("firstName"), getTestProperty("midName"));
        userFormPage.selectTitle(MR.text);
        userFormPage.setGender(getTestProperty("gender.female"));
        userFormPage.setCheckBoxLang(getTestProperty("lang.hindi"));
    }
}
