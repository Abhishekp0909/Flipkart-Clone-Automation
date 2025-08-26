package Logo;

import Base.BaseClass;
import Overlap.OverlapCheck;
import org.openqa.selenium.Rectangle;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TC11LogoOverLap {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoOverLap(){
        Logo logo=new Logo();
        OverlapCheck overlap=new OverlapCheck();
        Rectangle logoRect=logo.getLogoElement().getRect();
        Rectangle menuRect=logo.getMenuOptions().getRect();
        boolean checkOverlap=overlap.isOverlapping(logoRect,menuRect);
        Assert.assertFalse(checkOverlap,"Logo Overlap With Navigation Menu");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
