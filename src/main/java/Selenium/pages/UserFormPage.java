package Selenium.pages;

import Selenium.util.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

import static org.testng.AssertJUnit.assertEquals;

public class UserFormPage {

    private WebDriver driver;

    public UserFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (css = "select[id='TitleId']")
    WebElement dropListTitle;

    @FindBy(css = "input[id='Initial']")
    WebElement textInitial;

    @FindBy(css = "input[id='FirstName']")
    WebElement textFirstName;

    @FindBy(css = "input[id='MiddleName']")
    WebElement textMiddleName;

    @FindBy(css = "input[name='Male']")
    WebElement radioMale;

    @FindBy(css = "input[name='Female']")
    WebElement radioFemale;

    @FindBy(css = "input[name='english']")
    WebElement checkBoxEnglish;

    @FindBy(css = "input[name='Hindi']")
    WebElement checkBoxHindi;

    @FindBy(css = "input[name='Save']")
    WebElement buttonSave;

    @FindBy(css = "a[href='http://executeautomation.com/demosite/popup.html']")
    WebElement linkHtmlPopup;

    @FindBy(css = "input[name='generate']")
    WebElement buttonGenerate;

    @Step("Select Title [{0}] on User Form")
    public UserFormPage selectTitle(String title) {
            Util.selectElementFromDropListByText(title, dropListTitle);
        return this;
    }

    @Step("Fill Initial [{0}], First Name [{1}] and Middle Name [{2}]")
    public UserFormPage sendKeysToTextFields(String initial, String firstName, String midName) {
        Util.sendKeysToElement(initial, textInitial);
        Util.sendKeysToElement(firstName, textFirstName);
        Util.sendKeysToElement(midName, textMiddleName);
        return this;
    }

    @Step("Check User Form Page Title")
    public void checkPageTitle(WebDriver driver) {
        assertEquals(driver.getTitle(), "Execute Automation");
    }




}
