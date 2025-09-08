package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import java.awt.*;

public class TC12NavigationMenuOnTableView {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void NavigationMenuOnTableView(){
        Navigation navigation=new Navigation();
        Dimension tableSize=new Dimension(768,1024);
        BaseClass.getDriver().manage().window().setSize(tableSize);
        WebElement tabletView=navigation.getHomePageNavigationMenu();
        Assert.assertTrue(tabletView.isDisplayed(),"Test Fail:Navigation Menu not visible on tablet");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
