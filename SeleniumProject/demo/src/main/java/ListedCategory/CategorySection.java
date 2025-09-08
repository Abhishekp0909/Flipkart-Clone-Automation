package ListedCategory;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategorySection {
    private final By categorySection=By.id("accordian");

    public WebElement getCategoryPage(){
        return BaseClass.getDriver().findElement(categorySection);
    }
}
