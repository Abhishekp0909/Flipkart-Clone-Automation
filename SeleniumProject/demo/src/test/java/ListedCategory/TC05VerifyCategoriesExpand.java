package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TC05VerifyCategoriesExpand {
    @BeforeMethod
    public void setup(){
        BaseClass.launchBrowser();
    }
    @Test
    public void VerifyCategoriesExpand(){
        CategorySection category=new CategorySection();
        WebDriverWait wait=new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(10));
        WebElement categoryPanel=wait.until(ExpectedConditions.visibilityOf(category.getCategoryPage()));
        Assert.assertTrue(categoryPanel.isDisplayed(),"Test Fail:Category Panel Is Not Visible");

        WebElement womenCategory=category.getWomenCategory();
        Assert.assertTrue(womenCategory.isDisplayed(),"Test Fail:Women Category Not Listed");
        womenCategory.click();

        List<WebElement> subCategories=category.getWomenSubSection();
        for(WebElement sub: subCategories){
            wait.until(ExpectedConditions.visibilityOf(sub));
            Assert.assertTrue(sub.isDisplayed(),"Sub_Category Not Listed"+sub.getText());
            System.out.println("Sub-Category Found: "+sub.getText());
        }

    }
    @AfterClass
    public void close(){
        BaseClass.closeBrowser();
    }
}
