package Logo;

import Base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC14LogoUsingKeyBoardNavigation {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoUsingKeyBoardNavigation(){
        Logo logo=new Logo();
        String homeUrl=BaseClass.getDriver().getCurrentUrl();
        WebElement logoImage=logo.getLogoImage();
        Actions actions=new Actions(BaseClass.getDriver());
        for (int i=0;i<10;i++){
            actions.sendKeys(Keys.TAB).perform();
            if (BaseClass.getDriver().switchTo().activeElement().equals(logoImage)) {
                break;
            }
        }
        WebElement activeElement=BaseClass.getDriver().switchTo().activeElement();
        Assert.assertEquals(activeElement,logoImage,"Test Fail:Logo Is Not Focusable Using Tab");
        actions.sendKeys(Keys.ENTER).perform();
        String currentUrl=BaseClass.getDriver().getCurrentUrl();
        Assert.assertEquals(homeUrl,currentUrl,"Test Fail:Logo Did Not Navigate Using Keyboard");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
