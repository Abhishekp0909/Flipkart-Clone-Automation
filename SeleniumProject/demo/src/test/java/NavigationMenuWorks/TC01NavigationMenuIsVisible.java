package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01NavigationMenuIsVisible {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void NavigationMenuIsVisible(){
        Navigation navigation=new Navigation();
        WebElement homePageMenu= navigation.getHomePageNavigationMenu();
        Assert.assertTrue(homePageMenu.isDisplayed(),"Test Fail:Navigation Menu Is Not Present On HomePage");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
