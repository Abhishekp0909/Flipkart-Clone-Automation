package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04VerifyCartMenuClick {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyCartMenuClick(){
        Navigation navigation=new Navigation();
        navigation.cart().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String cartUrl="https://automationexercise.com/view_cart";
        Assert.assertEquals(currentUrl,cartUrl,"Test Fail:Cart Menu Did Not Open");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
