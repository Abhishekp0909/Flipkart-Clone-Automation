package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CategorySection {
    private final By categorySection=By.xpath("//div[@class='col-sm-3']");
    private final By womenCategory=By.xpath("//div[@class='left-sidebar']//a[normalize-space()='Women']");
    private final By menCategory=By.xpath("//div[@class='left-sidebar']//a[normalize-space()='Men']");
    private final By kidsCategory=By.xpath("//div[@class='left-sidebar']//a[normalize-space()='Kids']");
    private final By womenSubCategory=By.cssSelector("//div[@class='left-sidebar']//a[normalize-space(text())='Women']/following-sibling::ul/li/a");

    public WebElement getCategoryPage(){
        return BaseClass.getDriver().findElement(categorySection);
    }
    public WebElement getWomenCategory(){
        return BaseClass.getDriver().findElement(womenCategory);
    }
    public WebElement getMenCategory(){
        return BaseClass.getDriver().findElement(menCategory);
    }
    public WebElement getKidsCategory(){
        return BaseClass.getDriver().findElement(kidsCategory);
    }
    public List<WebElement> getWomenSubSection(){
        return BaseClass.getDriver().findElements(womenSubCategory);
    }
}
