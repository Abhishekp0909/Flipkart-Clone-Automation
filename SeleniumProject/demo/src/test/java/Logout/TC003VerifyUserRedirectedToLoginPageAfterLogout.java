package Logout;

import Base.BaseClass;
import Login.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC003VerifyUserRedirectedToLoginPageAfterLogout {
    @BeforeMethod
    public void open(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyUserRedirectedToLoginPageAfterLogout(){
        LoginPage login=new LoginPage();
        login.getLoginPage();
        login.getNameTextField("HarryVerma@hotmail.com");
        login.getPassTextField("Harry@45");
        login.getSubmitButton();
        login.clickLogout();
        boolean loginPageDisplay=login.loggedInPage();
        Assert.assertTrue(loginPageDisplay,"Test Fail:User Not Navigated Login Page After SuccessFull Logout");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
