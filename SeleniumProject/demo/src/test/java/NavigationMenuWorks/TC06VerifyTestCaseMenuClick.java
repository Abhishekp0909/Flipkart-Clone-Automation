package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC06VerifyTestCaseMenuClick {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyTestCaseMenuClick(){
        Navigation navigation=new Navigation();
        navigation.testCase().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String testCaseUrl="https://automationexercise.com/test_cases";
        Assert.assertEquals(currentUrl,testCaseUrl,"Test Fail:Not Navigated to test Case Menu");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
