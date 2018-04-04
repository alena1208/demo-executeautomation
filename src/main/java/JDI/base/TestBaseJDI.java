package JDI.base;

import JDI.EASite;
import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebBrowsers;

public class TestBaseJDI extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(EASite.class);
        EASite.open();
        Verify.getFails();
        JDISettings.logger.info("Run Tests");
    }

    @AfterMethod
    public void tearDownMethod() {
        Verify.getFails();
    }

    @AfterSuite
    public static void tearDown() throws IOException {
        killAllRunWebBrowsers();
    }
}
