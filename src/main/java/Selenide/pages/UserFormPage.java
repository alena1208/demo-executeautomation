package Selenide.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertEquals;

public class UserFormPage {
    @FindBy(css = "select[id='TitleId']")
    SelenideElement dropListTitle;

    @FindBy(css = "input[id='Initial']")
    SelenideElement textInitial;

    @FindBy(css = "input[id='FirstName']")
    SelenideElement textFirstName;

    @FindBy(css = "input[id='MiddleName']")
    SelenideElement textMiddleName;

    @FindBy(xpath = "//td/input[@type='radio']")
    SelenideElement radioGender;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    ElementsCollection languages;

    @FindBy(css = "input[name='Save']")
    SelenideElement buttonSave;

    @FindBy(css = "a[href='http://executeautomation.com/demosite/popup.html']")
    SelenideElement linkHtmlPopup;

    @FindBy(css = "input[name='generate']")
    SelenideElement buttonGenerate;

    @Step("Select Title [{0}] on User Form")
    public UserFormPage selectTitle(String title) {
        dropListTitle.selectOption(title);
        return this;
    }

    @Step("Fill Initial [{0}], First Name [{1}] and Middle Name [{2}]")
    public UserFormPage sendKeysToTextFields(String initial, String firstName, String midName) {
        textInitial.should(visible);
        textInitial.sendKeys(initial);
        textFirstName.sendKeys(firstName);
        textMiddleName.sendKeys(midName);
        return this;
    }

    @Step("Check Title on User Form Page ")
    public void checkPageTitle(WebDriver driver) {
        assertEquals(driver.getTitle(), "Execute Automation");
    }

    @Step("Set radiobutton Gender [{0}]")
    public void setGender(String gender) {
        radioGender.selectRadio(gender);
    }

    @Step("Select checkbox Language [{0}]")
    public void setCheckBoxLang(String language) {
       languages.stream().filter(e -> language.equals(e.getAttribute("name"))).findFirst().get().shouldNotBe(selected).click();
    }
}
