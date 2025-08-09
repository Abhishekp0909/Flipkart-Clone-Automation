package Logout;

import Base.BaseClass;
import Login.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001VerifyLogoutVisible {
    @BeforeMethod
    public void open(){
        BaseClass.launchBrowser();
    }
    @Test
    public void verifyLogoutVisible(){
        LoginPage login=new LoginPage();
        login.getLoginPage();
        login.getNameTextField("HarryVerma@hotmail.com");
        login.getPassTextField("Harry@45");
        login.getSubmitButton();
        boolean logout= login.getLogOutOption();
        Assert.assertTrue(logout,"Test Fail:Logout Option is Not Present");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
