package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05VerifySignUpOrLogInClick {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifySignUpOrLogInClick(){
        Navigation navigation=new Navigation();
        navigation.signUpOrLogIn().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String singUpOrLogInUrl="https://automationexercise.com/login";
        Assert.assertEquals(currentUrl,singUpOrLogInUrl,"Test Fail:Not Navigated To Login Page");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
