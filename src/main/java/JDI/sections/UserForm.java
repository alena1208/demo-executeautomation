package JDI.sections;

import JDI.entities.UserFormEntity;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;

public class UserForm  extends Form<UserFormEntity> {
    @JFindBy(text = "Title")
    Dropdown title;
}
