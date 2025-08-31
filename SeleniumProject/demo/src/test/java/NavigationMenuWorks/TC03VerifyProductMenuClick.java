package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03VerifyProductMenuClick {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyProductMenuClick(){
        Navigation navigation=new Navigation();
        navigation.product().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String productPageUrl="https://automationexercise.com/products";
        Assert.assertEquals(currentUrl,productPageUrl,"Test Fail:Product menu option not navigated to product page");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
