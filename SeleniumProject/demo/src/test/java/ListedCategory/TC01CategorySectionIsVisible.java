package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01CategorySectionIsVisible {
    @BeforeMethod
    public void setup() {
        BaseClass.launchBrowser();
    }
    @Test
    public void CategorySectionIsVisible(){
        CategorySection categorySection=new CategorySection();
        WebElement category=categorySection.getCategoryPage();
        Assert.assertTrue(category.isDisplayed(),"Test Fail:Category Section is Not Available");
    }
    @AfterMethod
    public void close(){
        BaseClass.closeBrowser();
    }
}
