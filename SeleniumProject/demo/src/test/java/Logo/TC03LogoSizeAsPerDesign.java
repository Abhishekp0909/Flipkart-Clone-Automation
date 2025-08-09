package Logo;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03LogoSizeAsPerDesign {

        @BeforeMethod
        public  void open(){
            BaseClass.launchBrowser();
        }
    @Test
    public void LogoSizeAsPerDesign(){
            Logo logo=new Logo();
          WebElement realLogo= logo.getLogoElement();

      int actualWidth=realLogo.getSize().height;
      int actulaHeight=realLogo.getSize().width;

      int expectedWidth=40;
      int expectedHeight=120;

        Assert.assertEquals(actulaHeight,expectedHeight,"Test Fail:Height Not Match ");
        Assert.assertEquals(actualWidth,expectedHeight,"Test Fail:Width Not Match");
    }
}
