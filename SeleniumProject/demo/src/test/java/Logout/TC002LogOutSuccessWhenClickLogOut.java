package Logout;

import Base.BaseClass;
import Login.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002LogOutSuccessWhenClickLogOut {
    @BeforeMethod
    public void open(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogOutSuccessWhenClickLogOut(){
        LoginPage login=new LoginPage();
        login.getLoginPage();
        login.getNameTextField("HarryVerma@hotmail.com");
        login.getPassTextField("Harry@45");
        login.getSubmitButton();
        login.clickLogout();
        boolean emailFieldVisible=login.nameField();
        Assert.assertTrue(emailFieldVisible,"Test Fail:User Still Logged In After Click Logout");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
