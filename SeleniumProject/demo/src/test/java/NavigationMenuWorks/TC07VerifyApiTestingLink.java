package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC07VerifyApiTestingLink {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyApiTestingLink(){
        Navigation navigation=new Navigation();
        navigation.apiTesting().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String apiTestingUrl="https://automationexercise.com/api_list";
        Assert.assertEquals(currentUrl,apiTestingUrl,"Test Fail:Not Navigated to api testing");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
