package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * 2. Create the package utilities and create the class
 * with the name ‘Utility’ inside the ‘utilities’
 * package. And write the all the utility methods in
 * it’.
 */
public class Utility extends BaseTest {
    // This Method will click on any element whatever locator we are passing
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // This Method will send text on element
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // This Method will get Text from Element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //*************************  Method *************************//

    public int productsDisplayed(By by) {
        List<WebElement> productsDisplayed = driver.findElements(by);
        int number = productsDisplayed.size();
        return number;
    }
}