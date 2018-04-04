package JDI;

import JDI.pages.UserFormJPage;
import JDI.sections.Header;
import JDI.sections.Login;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.openqa.selenium.support.FindBy;

@JSite("http://executeautomation.com/demosite/Login.html")
public class EASite extends WebSite {
    // All Pages
    @JPage(title = "User Form")
    public static UserFormJPage userFormPage;

    //Sections
    @FindBy(css = "#cssmenu")
    public static Header header;

    public static Login loginForm;
}
