package NavigationMenuWorks;

import Base.BaseClass;
import NavigationMenu.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC08VerifyVideoTutLink {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyVideoTutLink(){
        Navigation navigation=new Navigation();
        navigation.videoTutorial().click();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        String videoTutUrl="https://www.youtube.com/c/AutomationExercise";
        Assert.assertEquals(currentUrl,videoTutUrl,"Test Fail:Not Navigated to videoTutorial");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
