package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logo {
    private final By findLogo=By.xpath("//img[@alt='Website for automation practice']");
    public WebElement getLogoElement(){
        return BaseClass.getDriver().findElement(findLogo);
    }
}
