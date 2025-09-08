package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC17VerifyNavbarSticky {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyNavbarSticky() throws InterruptedException{
        Navigation navigation=new Navigation();
        WebElement navbar=navigation.getNavBar();
        int initialY=navbar.getLocation().getY();
        System.out.println("Initial Navbar Y: "+initialY);

        JavascriptExecutor js=(JavascriptExecutor) BaseClass.getDriver();
        js.executeScript("window.scrollTo(0,1000);");
        Thread.sleep(1000);

        int afterScrollY=navbar.getLocation().getY();
        System.out.println("After Scroll Navbar Y: "+afterScrollY);

        Assert.assertEquals(afterScrollY,initialY,"Test Fail:Navbar is Not Sticky! It Moved on Scroll");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }

}
