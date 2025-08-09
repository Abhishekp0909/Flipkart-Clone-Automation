package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logo {
    private final By findLogo=By.xpath("//img[@alt='Website for automation practice']");
    private final By logoImage=By.xpath("//img[@src='/static/images/home/logo.png']");
    public WebElement getLogoElement(){
        return BaseClass.getDriver().findElement(findLogo);
    }
    public  WebElement getLogoImage(){
        return BaseClass.getDriver().findElement(logoImage);
    }
}
