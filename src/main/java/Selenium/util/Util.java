package Selenium.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Util {

    public static void clickOnElement(WebElement element){
        element.click();
    }

    public static void sendKeysToElement(String keys, WebElement element){
        element.sendKeys(keys);
    }

    public static  void selectElementFromDropListByText(String text, WebElement element){
        new Select(element).selectByVisibleText(text);
    }

}
