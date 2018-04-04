package JDI.sections;

import JDI.entities.User;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.common.TextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import org.openqa.selenium.support.FindBy;

public class Login extends Form<User> {
    @FindBy(css = "input[name='UserName']")
    public TextField name;

    @FindBy(css = "input[name='Password']")
    public TextField password;

    @FindBy(css = "input[name='Login']")
    public Button buttonLogin;
    }
