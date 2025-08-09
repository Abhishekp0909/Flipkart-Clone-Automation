package Login;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC004ValidCredential {
    @BeforeMethod
            public void open() {
        BaseClass.launchBrowser();
    }
    @Test
    public void ValidCredential(){
        LoginPage login=new LoginPage();
        login.getLoginPage();
        login.getNameTextField("HarryVerma@hotmail.com");
        login.getPassTextField("Harry@45");
        login.getSubmitButton();
        boolean logOutButton=login.getLogOutOption();
        Assert.assertTrue(logOutButton,"Test Failed:Login failed with valid Credential");
    }
    @AfterMethod
    public  void close(){
        BaseClass.closeBrowser();
    }
}
