package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC15VerifyKeyBoardNavigationThroughMenu {

    @BeforeMethod
    public void setup() {
        BaseClass.launchBrowser();
        BaseClass.getDriver().get("https://automationexercise.com/");
    }

    @Test
    public void VerifyKeyBoardNavigationThroughMenu() throws InterruptedException {
        Navigation navigation = new Navigation();
        List<WebElement> menuItems = navigation.getAllMenuItem();
        Assert.assertFalse(menuItems.isEmpty(), "No Navigation Menu Items Found!");

        Actions actions = new Actions(BaseClass.getDriver());

        for (WebElement menuItem : menuItems) {

            ((org.openqa.selenium.JavascriptExecutor) BaseClass.getDriver())
                    .executeScript("arguments[0].scrollIntoView(true); arguments[0].focus();", menuItem);

            Thread.sleep(300);

            String focusedText = menuItem.getText().trim();
            System.out.println("Focused Menu Item: " + focusedText);


            Assert.assertTrue(menuItem.isDisplayed(), "Menu item not visible: " + focusedText);
            Assert.assertTrue(menuItem.isEnabled(), "Menu item not enabled: " + focusedText);


        }
    }

    @AfterMethod
    public void close() {
        BaseClass.closeBrowser();
    }
}
