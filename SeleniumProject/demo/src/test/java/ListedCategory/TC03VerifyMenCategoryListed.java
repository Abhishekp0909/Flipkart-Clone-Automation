package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03VerifyMenCategoryListed {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyMenCategoryListed(){
        CategorySection category=new CategorySection();
        WebElement menCategory= category.getMenCategory();
        Assert.assertTrue(menCategory.isDisplayed(),"Test Fail:Men category not listed");
        System.out.println("Men Category is listed");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }

}
