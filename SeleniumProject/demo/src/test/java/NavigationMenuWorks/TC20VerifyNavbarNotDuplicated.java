package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC20VerifyNavbarNotDuplicated {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyNavbarNotDuplicated(){
        Navigation navigation=new Navigation();
        List<WebElement> navbarBefore=navigation.getAllNavbar();
        int initialCount=navbarBefore.size();
        System.out.println("Initial navbar count: " +initialCount);
        Assert.assertEquals(initialCount,1,"Test Fail Multiple Navbar found initially");

        BaseClass.getDriver().navigate().refresh();

        List<WebElement> navbarAfter=navigation.getAllNavbar();
        int afterRefreshCount=navbarAfter.size();
        System.out.println("Navbar count after refresh: "+afterRefreshCount);
        Assert.assertEquals(afterRefreshCount,1,"Test Fail:Navbar duplicate after refresh");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }

}
