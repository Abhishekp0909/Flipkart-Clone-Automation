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

public class TC13VerifyNavigationMenuOnMobile {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyNavigationMenuOnMobile(){
        Navigation navigation=new Navigation();
        Dimension tableSize=new Dimension(375,667);
        BaseClass.getDriver().manage().window().setSize(tableSize);
        WebElement mobileView=navigation.getHomePageNavigationMenu();
        Assert.assertTrue(mobileView.isDisplayed(),"Test Fail:Navigation menu not displayed on mobile view");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
