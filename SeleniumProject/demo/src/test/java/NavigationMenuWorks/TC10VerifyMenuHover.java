package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC10VerifyMenuHover {
    @BeforeMethod
    public void start(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyMenuHover(){
        Navigation navigation=new Navigation();
        WebElement homeMenu=navigation.Home();
        String beforeHover=homeMenu.getCssValue("text-decoration-line");
        Actions actions= new Actions(BaseClass.getDriver());
        actions.moveToElement(homeMenu).perform();
        String afterHover=homeMenu.getCssValue("text-decoration-line");
        System.out.println("Before Hover"+beforeHover);
        System.out.println("After Hover"+afterHover);
        Assert.assertEquals(afterHover, "underline", "Hover effect not applied!");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
