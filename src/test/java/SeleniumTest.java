import Selenium.base.BaseSelenium;
import Selenium.base.EnumsOfProject;
import Selenium.pages.LoginPage;
import Selenium.pages.UserFormPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Selenium.util.TargetProperties.getTestProperty;


public class SeleniumTest extends BaseSelenium{

    private LoginPage loginPage;
    private UserFormPage userFormPage;

    @BeforeClass
    public void setUpPages(){
        loginPage = new LoginPage(driver);
        userFormPage = new UserFormPage(driver);
        driver.manage().window().maximize();
        driver.navigate().to(getTestProperty("url"));
    }

    @Test
    public void loginTest(){
    loginPage.login(getTestProperty("login"), getTestProperty("password"));
    userFormPage.checkPageTitle(driver);
    userFormPage.sendKeysToTextFields(getTestProperty("initialName"),getTestProperty("firstName"), getTestProperty("midName")).
            selectTitle(EnumsOfProject.Title.MS.text);
    }
}
