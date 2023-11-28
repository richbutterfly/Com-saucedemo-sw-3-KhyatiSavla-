package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/** 3. Create the package ‘testsuite’ and create the
 following class inside the ‘testsuite’ package.
 1. LoginTest
 4. Write down the following test into ‘LoginTest’
 class
 1. userSholdLoginSuccessfullyWithValid
 Credentials
 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify the text “PRODUCTS”
 2. verifyThatSixProductsAreDisplayedOnPage
 * Enter “standard_user” username
 * Enter “secret_sauce” password
 * Click on ‘LOGIN’ button
 * Verify that six products are displayed
 on page
 */
public class LoginTest extends Utility {
    String baseURL = "https://www.saucedemo.com/";
    @Before
    public void setUp(){
        openBrowser(baseURL);
    }
    @Test
    //Write down the following test into ‘LoginTest’ class
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter Valid Email Id in Username field
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter Valid Password in Password field
        sendTextToElement(By.name("password"),"secret_sauce");
        // Find the Click button and click on it
        clickOnElement(By.id("login-button"));
        // Verify the text 'PRODUCTS'
        String expectedText = "Products";
        String actualText = getTextFromElement(By.xpath("//span[@class = 'title']"));
        //Verify Expected and Actual Text are same
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void VerifyThatSixProductsAreDisplayedOnPage (){
        //Enter Valid Email Id in Username field
        sendTextToElement(By.id("user-name"),"standard_user");
        //Enter Valid Password in Password field
        sendTextToElement(By.name("password"),"secret_sauce");
        // Find the Click button and click on it
        clickOnElement(By.id("login-button"));
       // Verify six products are displayed on page
        int actualNum = productsDisplayed(By.xpath("//div[@class = 'inventory_item']"));
        int expectedNum = 6;
        // Validate actual number of product with expected number
        Assert.assertEquals(expectedNum,actualNum);

    }
    @After
   public void tearDown (){
       closeBrowser();
   }
}
