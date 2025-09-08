package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC16VerifyNavigationMenuDoseNotOverlapContent {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyNavigationMenuDoseNotOverlapContent(){
        Navigation navigation=new Navigation();
        List<WebElement> menuItems=navigation.getAllMenuItem();
        Assert.assertFalse(menuItems.isEmpty(),"No Navigation Menu Items are found");

        WebElement navbar=navigation.getNavBar();
        int navbarButton=navbar.getLocation().getY()+navbar.getSize().getHeight();

        WebElement mainContent=navigation.getMainContent();
        int contentTop=mainContent.getLocation().getY();

        System.out.println("Navbar Buttons Y: "+navbarButton);
        System.out.println("Content Top Y: "+contentTop);

        Assert.assertTrue(navbarButton<=contentTop,"Test Fail:Navbar OverLap Main Content");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }

}
