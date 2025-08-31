package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC11VerifyActiveMenuHighlight {
    @BeforeMethod
    public void start(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyActiveMenuHighlight(){
        Navigation navigation=new Navigation();
        WebElement contactUsMenu=navigation.contactUs();
        contactUsMenu.click();
        WebElement activeElement=navigation.contactUs();
        String bgColor=activeElement.getCssValue("background-color");
        String hexColor= Color.fromString(bgColor).asHex();
        String expectedColor="#ffffff";
        Assert.assertEquals(hexColor,expectedColor,"Test Fail:Active Menu highlighted color mismatch");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
