package Login;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Base64;

public class TC005LoginWithValidEMailInvalidPass {
    @BeforeMethod
    public void open(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LoginWithValidEMailInvalidPass(){
        LoginPage login=new LoginPage();
        login.getLoginPage();
        login.getNameTextField("HarryVerma@hotmail.com");
        login.getPassTextField("Harry");
        login.getSubmitButton();
       boolean loginError= login.getErrorMsg();
        Assert.assertTrue(loginError,"Test Fail:User Login with Invalid Password");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
