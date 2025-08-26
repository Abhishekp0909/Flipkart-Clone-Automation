package Logo;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logo {
    private final By findLogo=By.xpath("//img[@alt='Website for automation practice']");
    private final By logoImage=By.xpath("//img[@src='/static/images/home/logo.png']");
    private final By menuOptions=By.xpath("//div[@class='col-sm-8']");

    public WebElement getLogoElement(){
        return BaseClass.getDriver().findElement(findLogo);
    }
    public  WebElement getLogoImage(){
        return BaseClass.getDriver().findElement(logoImage);
    }
    public WebElement getMenuOptions(){
        return BaseClass.getDriver().findElement(menuOptions);
    }
}
