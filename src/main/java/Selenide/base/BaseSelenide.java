package Selenide.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseSelenide {

    @BeforeSuite
    public void setUpSuite() {
        System.setProperty("webdriver.chrome", "chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

        Configuration.timeout = 6000;
        Configuration.pollingInterval = 200;
        Configuration.collectionsPollingInterval = 300;
    }

    @AfterSuite
    public void tearDown (){
        WebDriverRunner.getWebDriver().quit();
    }
}
