package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02VerifyWomenCategoryListed {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyWomenCategoryListed(){
        CategorySection category=new CategorySection();
        WebElement womenCategory= category.getWomenCategory();
            Assert.assertTrue(womenCategory.isDisplayed(),"Test Fail:Women Category not listed");
        System.out.println("Women Category is listed");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
