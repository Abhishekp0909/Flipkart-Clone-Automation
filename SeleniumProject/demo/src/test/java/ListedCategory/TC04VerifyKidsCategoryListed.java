package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC04VerifyKidsCategoryListed {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void KidsCategoryListed(){
        CategorySection category=new CategorySection();
        WebElement kidCategory= category.getKidsCategory();
        Assert.assertTrue(kidCategory.isDisplayed(),"Test Fail:Kids Category Not Listed");
        System.out.println("Kids Category is Listed");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
