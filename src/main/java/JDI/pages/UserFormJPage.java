package JDI.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.ICheckBox;
import com.epam.jdi.uitests.core.interfaces.common.ILink;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.core.interfaces.complex.IDropList;
import com.epam.jdi.uitests.core.interfaces.complex.IRadioButtons;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

public class UserFormJPage extends WebPage {
    @FindBy(css = "select[id='TitleId']")
    public IDropList dropListTitle;

    @FindBy(css = "input[id='Initial']")
    public ITextField textInitial;

    @FindBy(css = "input[id='FirstName']")
    public ITextField textFirstName;

    @FindBy(css = "input[id='MiddleName']")
    public ITextField textMiddleName;

    @FindBy(xpath = "//td/input[@type='radio']")
    public IRadioButtons radioGender;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public ICheckBox languages;

    @FindBy(css = "input[name='Save']")
    public IButton buttonSave;

    @FindBy(css = "a[href='http://executeautomation.com/demosite/popup.html']")
    public ILink linkHtmlPopup;

    @FindBy(css = "input[name='generate']")
    public IButton buttonGenerate;
}
