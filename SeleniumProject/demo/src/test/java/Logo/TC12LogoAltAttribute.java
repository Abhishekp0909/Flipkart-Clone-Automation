package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC12LogoAltAttribute {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void LogoAltAttribute(){
        Logo logo=new Logo();
        WebElement logoImage=logo.getLogoImage();
        String altText=logoImage.getAttribute("alt");
        Assert.assertNotNull(altText,"Logo Dose Not Have alt Attribute");
        Assert.assertFalse(altText.trim().isEmpty(),"Logo alt Attribute is Empty");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
